package com.daniel.jdcg_eva02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daniel.jdcg_eva02.databinding.ActivityInformationBinding

class Information : AppCompatActivity() {

    private lateinit var binding: ActivityInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}