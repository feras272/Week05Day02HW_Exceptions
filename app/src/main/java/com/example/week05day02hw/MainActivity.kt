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

    }

    private fun connectViews() {
        constraintLayout = findViewById(R.id.container)
        buttonNull = findViewById(R.id.btn_null)
        buttonIndex = findViewById(R.id.btn_index)
        buttonToast = findViewById(R.id.btn_toast)
        buttonSnack = findViewById(R.id.btn_snack)
    }



}