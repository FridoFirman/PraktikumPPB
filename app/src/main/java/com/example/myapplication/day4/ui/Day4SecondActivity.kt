package com.example.myapplication.day4.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityDay4SecondBinding

class Day4SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDay4SecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDay4SecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}