package it.mapo.indiewakabout.hiltsample

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
        @Named("String2") testString2: String   // inject into a viewmodel
    ) : ViewModel() {

        init {
            Log.d("ViewModel","Test string from ViewModel: $testString2")
        }
}