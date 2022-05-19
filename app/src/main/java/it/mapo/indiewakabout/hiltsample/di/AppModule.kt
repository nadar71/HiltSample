package it.mapo.indiewakabout.hiltsample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // scope module, *Component
object AppModule {
    // Use @Singleton to oblige reuse, otherwise it creates a new instances
    // works inly in combination with SingletonComponent
    @Singleton
    @Provides
    @Named("String1")
    fun providerTestString_01() = "This is string we will inject"

    @Singleton
    @Provides
    @Named("String2")
    fun providerTestString_02() = "This is string we will inject AS WELL"

}

