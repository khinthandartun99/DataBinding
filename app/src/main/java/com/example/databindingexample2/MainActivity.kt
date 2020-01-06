package com.example.databindingexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingexample2.databinding.ActivityMainBinding
import com.example.databindingexample2.model.Person

class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


         binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.txtWelcome.text="Hello Khin Thandar"

        binding.btnAdd.setOnClickListener {
            var person = Person(binding.editName.text.toString())
            binding.myName=person

        }
    }
}
