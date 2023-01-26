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


        funcA(1)


    }

    private fun funcA(i: Int) {
        when(i){
            1-> {
                Log.d("taskRunning", "Task1 in A is working...")
                funcB(1)
            }
            2->{
                Log.d("taskRunning", "Task2 in A is working...")
                funcB(2)
            }
            3->{
                Log.d("taskRunning", "Task3 in A is working...")
                funcB(3)
            }
            4->{
                Log.d("taskRunning", "Task4 in A is working End.")
                funcB(4)
            }
        }
    }

    private fun funcB(i: Int) {
        when(i){
            1->{
                Log.d("taskRunning", "task1 in B is working...")
                funcA(2)
            }
            2->{
                Log.d("taskRunning", "task2 in B is working...")
                funcA(3)
            }
            3->{
                Log.d("taskRunning", "task3 in B is working...")
                funcA(4)
            }
            4->{
                Log.d("taskRunning", "task4 in B is working End.")
            }
        }
    }
}
