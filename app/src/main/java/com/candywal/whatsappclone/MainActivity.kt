package com.candywal.whatsappclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //test
        // Initialize Firebase Auth
        auth = Firebase.auth
        val regName = regName.text.toString()
        val regNum = regPhone.text.toString()

        Log.d("MainActivity", "Name is $regName")
        Log.d("MainActivity", "Num is $regNum")
       }
    // Checks if the user is logged in already
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        //updateUI(currentUser)
    }
}