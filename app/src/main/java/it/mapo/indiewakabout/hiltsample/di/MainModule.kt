package it.mapo.indiewakabout.hiltsample.di

import android.content.Context
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import it.mapo.indiewakabout.hiltsample.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class) // scope module: *Component
object MainModule {
    @ActivityScoped // singleton but live lifetime's activity 
    @Provides
    @Named("String3")
    fun providerTestString_03(
        @ApplicationContext context: Context,
        @Named("String1") testString1: String // injection as a parameter
    ) = "${ context.getString(R.string.string_to_inject)}  - $testString1"

}

