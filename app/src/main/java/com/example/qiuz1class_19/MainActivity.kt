package com.example.qiuz1class_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.qiuz1class_19.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.playBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Button Click", Toast.LENGTH_LONG).show()
        }
    }
}