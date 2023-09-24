package com.example.architecturecomponents.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.architecturecomponents.R
import com.example.architecturecomponents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        handlingFunctions()

    }

    private fun handlingFunctions() {
        handlingLateinitProperties()
    }

    private fun handlingLateinitProperties() {

    }


    override fun onDestroy() {
        super.onDestroy()
        binding.unbind()
    }
}