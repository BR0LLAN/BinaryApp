package com.devcraft.binaryoptions.freeapp.presentation.ui.aboutIUsActivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.presentation.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_about_us.*

class AboutUsActivity : AppCompatActivity(R.layout.activity_about_us) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        btn_back.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}