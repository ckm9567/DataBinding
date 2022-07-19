package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding = ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        var student: Student = Student("Ali", "RSF")
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnSetData.setOnClickListener(){
            binding.myStudent = student
            //binding.tvName.text = "Ali"
            //binding.tvProgramme.text = "RSF"

        }
        binding.btnChangeValue.setOnClickListener(){
            student.programme = "RIT"
            binding.invalidateAll();
            //binding.tvName.text = "Ali"
            //binding.tvProgramme.text = "RSF"

        }
    }


}