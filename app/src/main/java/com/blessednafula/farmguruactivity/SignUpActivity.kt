package com.blessednafula.farmguruactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var tilname: TextInputLayout
    lateinit var tilmail: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etpassword: TextInputEditText
    lateinit var tilconfirmation: TextInputLayout
    lateinit var etconfirmation: TextInputEditText
    lateinit var btnSign: Button
    lateinit var tvSign: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        tilname = findViewById(R.id.tilname)
        tilmail = findViewById(R.id.tilmail)
        tilPassword = findViewById(R.id.tilPassword)
        tilconfirmation = findViewById(R.id.tilconfirmation)
        etconfirmation = findViewById(R.id.etconfirmation)
        tvSign = findViewById(R.id.tvSign)
        btnSign = findViewById(R.id.btnsign)
        btnSign.setOnClickListener {


            tvSign.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }


            fun validateSignUp() {
                var error = false
                tilname.error = null
                tilPassword.error = null
                tilmail.error = null
                tilconfirmation.error = null


                var pass = etpassword.text.toString()
                if (pass.isBlank()) {
                    tilPassword.error = "Password is required"
                    error = true
                }
                if (!error) {
                }
                var confirm = etconfirmation.text.toString()
                if (confirm.isBlank()) {
                    tilconfirmation.error = "password confirmation is required"
                }
                if (!error) {

            }
//                var name = etname.text.toString()
//                if (name.isBlank()) {
//                    tilname.error = "password confirmation is required"

                }
//                if (!error) {
            }

//                var email = etmail.text.toString()
//                if (email.isBlank()) {
//                    tilmail.error = "password confirmation is required"
//
//                }
//                if (!error) {
//                }
            }
        }


