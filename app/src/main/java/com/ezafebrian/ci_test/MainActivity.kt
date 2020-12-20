package com.ezafebrian.ci_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * Simple toast to test
        * Continuous-integration*/
        Toast.makeText(this, "Hello, World", Toast.LENGTH_SHORT).show()
    }
}