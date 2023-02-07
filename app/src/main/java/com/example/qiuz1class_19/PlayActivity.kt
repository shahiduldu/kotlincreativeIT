package com.example.qiuz1class_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qiuz1class_19.databinding.ActivityMainBinding
import com.example.qiuz1class_19.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
    lateinit var binding: ActivityPlayBinding
    private val quizlist= listOf<Quiz>(
        Quiz(question = "What is the capital of Bangladesh", option1 = "Dhaka", option2 = "Bogra", option3 = "Borishal", option4 = "B Baria", correctAnswer= "Dhaka"),
        Quiz(question = "What is the currency of Bangladesh", option1 = "Uro", option2 = "taka", option3 = "Real", option4 = "Dinar", correctAnswer= "taka"),
        Quiz(question = "What is the Flower of Bangladesh", option1 = "Sunflower", option2 = "podma", option3 = "Rose", option4 = "Belly", correctAnswer= "Padma"),
        Quiz(question = "What is the animal of Bangladesh", option1 = "Tiger", option2 = "Lion", option3 = "Cow", option4 = "Dear", correctAnswer= "Lion"),
        Quiz(question = "What is the Independence day of Bangladesh", option1 = "16 dec", option2 = "21 feb", option3 = "26 mar", option4 = "10 Jan", correctAnswer= "26 mar"),
        Quiz(question = "What is the victory day of Bangladesh", option1 = "26 mar", option2 = "16 dec", option3 = "21 feb", option4 = "14 feb", correctAnswer= "16 dec"),

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}