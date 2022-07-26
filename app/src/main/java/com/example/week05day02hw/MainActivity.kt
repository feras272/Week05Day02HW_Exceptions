package com.example.week05day02hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private var constraintLayout:ConstraintLayout? = null
    private var buttonNull:Button? = null
    private var buttonIndex:Button? = null
    private var buttonToast:Button? = null
    private var buttonSnack:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
        openToast(buttonToast!!)
        openToast(buttonNull!!)
        openToast(buttonIndex!!)
        openSnackbar(buttonSnack!!,"Snack bar message")
    }

    private fun connectViews() {
        constraintLayout = findViewById(R.id.container)
        buttonNull = findViewById(R.id.btn_null)
        buttonIndex = findViewById(R.id.btn_index)
        buttonToast = findViewById(R.id.btn_toast)
        buttonSnack = findViewById(R.id.btn_snack)
    }

    private fun openToast(button:Button) {

        if(button == buttonNull!!) {
            button.setOnClickListener {
                nullException()
                Toast.makeText(this, "this is null exception", Toast.LENGTH_SHORT).show()
            }
        }
        else if(button == buttonIndex!!) {
            button.setOnClickListener {
                indexException()
                Toast.makeText(this, "this is index out of bound exception", Toast.LENGTH_SHORT).show()
            }

        } else {
            button.setOnClickListener {
                Toast.makeText(this, "This is simple toast message", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun openSnackbar(button:Button, message:String) {
        button.setOnClickListener {
            Snackbar.make(constraintLayout!!, message, Snackbar.LENGTH_SHORT).setAction("Undo") {

            }.show()
        }

    }

    private fun nullException() {
        try {
            val number1:Int? = null
            val operation:Int = number1!! + 10
        }catch (e:NullPointerException) {
            Log.e("NULL_EXCEPTION", "Can not do equation with null variable")
        }
    }

    private fun indexException() {

        val arr:ArrayList<String> = ArrayList()
        arr.add("Khalid")
        arr.add("Ahmad")
        arr.add("Sarah")

        try {
            arr.get(3)
        }catch (e:IndexOutOfBoundsException) {
            Log.e("INDEX_EXCEPTION", "Can not do, this index is out of bound")
        }
    }

}