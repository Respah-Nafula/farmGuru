package com.blessednafula.farmguruactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
   lateinit var tilFirst: TextInputLayout
    lateinit var etFirst: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var tilConfirm:TextInputLayout
    lateinit var etConfirm:TextInputEditText
    lateinit var btnLogin:Button
    lateinit var tvSign:TextView
    



    override fun onCreate(savedInstanceState: Bundle?) {

        tilFirst=findViewById(R.id.tilFirst)
        etFirst=findViewById(R.id.etFirst)
        tilPassword=findViewById(R.id.tilPassword)
        etPassword=findViewById(R.id.etPassword)
        tilConfirm=findViewById(R.id.etConfirm)
        tvSign=findViewById(R.id.tvSign)
        btnLogin=findViewById(R.id.btnLogIn)
        btnLogin.setOnClickListener {
            validating()
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun validating(){


        }

    }
