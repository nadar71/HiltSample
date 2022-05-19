package it.mapo.indiewakabout.hiltsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint  // tell that we are injecting; for fragment, annotates it and their parent activity
class MainActivity : AppCompatActivity() {

    @Inject // this inject the object provided
    @Named("String1")
    lateinit var testString01: String

    @Inject // this inject the object provided
    @Named("String2")
    lateinit var testString02: String

    @Inject // this inject the object provided
    @Named("String3")
    lateinit var testString03: String

    private val viewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Test string from MainActivity : $testString01 ")
        Log.d("MainActivity", "Test string from MainActivity : $testString02 ")
        Log.d("MainActivity", "Test string from MainActivity : $testString03 ")

        viewModel  // this launch viewmodel init, which write the log.d with injection

    }
}