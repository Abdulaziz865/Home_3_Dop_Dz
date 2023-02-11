package com.example.home_3_dop_dz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.home_3_dop_dz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setonClickListener()
    }

    private fun setonClickListener() = with(binding) {
        btnSave.setOnClickListener {
            val account = Account
                .name(etName.text.toString())
                .middle(etMiddle.text.toString())
                .getID(etId.text.toString())
                .numberPhone(etNumberPhone.text.toString())
                .build()
            info1.text = account.info()
            info2.text = account.info2()
        }
    }
}