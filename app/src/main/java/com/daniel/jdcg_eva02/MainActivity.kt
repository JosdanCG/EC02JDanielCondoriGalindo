package com.daniel.jdcg_eva02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.daniel.jdcg_eva02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViews()
    }
    private fun setupViews() {
        binding.tilEmail.editText?.addTextChangedListener {text->
            binding.btnlogin.isEnabled = validateInputs(text.toString(), binding.tilPassword.editText?.text.toString())
        }
        binding.tilPassword.editText?.addTextChangedListener {text ->
            binding.btnlogin.isEnabled = validateInputs( binding.tilEmail.editText?.text.toString(),text.toString())
        }

        binding.btnlogin.setOnClickListener{
            val intent = Intent(this,PantallaPrincipal ::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"Login iniciado",Toast.LENGTH_SHORT).show()
        }
    }

    private fun validateInputs(email: String, password: String): Boolean{
            val isEmailOk = email.isNotEmpty() && email.equals("ejemplo@idat.edu.pe")
            val isPasswordOk = password.length == 6 && password.equals("123456")
            return isPasswordOk && isEmailOk
    }
}