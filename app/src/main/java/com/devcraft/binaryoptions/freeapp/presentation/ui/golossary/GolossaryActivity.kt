package com.devcraft.binaryoptions.freeapp.presentation.ui.golossary

import android.content.Intent
import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.app.Constants
import com.devcraft.binaryoptions.freeapp.presentation.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_golossary.*


class GolossaryActivity : AppCompatActivity(R.layout.activity_golossary) {

    private val golossaryAdapter: GolossaryAdapter = GolossaryAdapter(Constants.dataGolossary)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViews()
        initListeners()
    }

    private fun initViews() {
        rv_golossary.adapter = golossaryAdapter
        rv_golossary.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rv_golossary.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (dy > 0) {
                    top_container.visibility = View.GONE
                } else {
                    top_container.visibility = View.VISIBLE
                }
            }
        })
    }

    private fun initListeners() {
        btn_back.setOnClickListener {
            val animScale = AnimationUtils.loadAnimation(applicationContext, R.anim.other_btn)
            it.startAnimation(animScale)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}