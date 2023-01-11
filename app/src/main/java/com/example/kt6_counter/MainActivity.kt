package com.example.kt6_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kt6_counter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVP()
    }

    private fun initVP() {
        binding.vp.adapter = CountAdapter(supportFragmentManager)
    }


}