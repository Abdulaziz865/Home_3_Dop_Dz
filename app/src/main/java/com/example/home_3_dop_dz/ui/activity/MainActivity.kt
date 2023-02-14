package com.example.home_3_dop_dz.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.home_3_dop_dz.R
import com.example.home_3_dop_dz.data.singleton.Singleton
import com.example.home_3_dop_dz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.txtName.text = Singleton.MySingleton.getName()
        binding.txtMiddle.text = Singleton.MySingleton.getMiddle()
    }
}