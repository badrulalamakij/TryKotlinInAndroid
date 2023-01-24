package com.example.trykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//I make a comment from github to track myself from android studio
//This time i write some text on android studio to add on github

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var myString: String? = null

        lateinit var myLateinit: String

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myLateinit = "InitializedMe"

        Log.i("lateinitAndLazy", "lateinit vs lazy : " + myString + ", " + myLateinit)


    }
}
