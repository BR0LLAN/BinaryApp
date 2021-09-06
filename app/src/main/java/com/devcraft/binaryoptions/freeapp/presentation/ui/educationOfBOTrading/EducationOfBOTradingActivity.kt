package com.devcraft.binaryoptions.freeapp.presentation.ui.educationOfBOTrading

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.app.Constants
import com.devcraft.binaryoptions.freeapp.presentation.ui.articles.ArticleActivity
import com.devcraft.binaryoptions.freeapp.presentation.ui.main.MainActivity
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_education_of_bo_trading.*
import kotlinx.android.synthetic.main.activity_education_of_bo_trading.btn_back
import kotlinx.android.synthetic.main.activity_education_of_bo_trading.top_container

class EducationOfBOTradingActivity : AppCompatActivity(R.layout.activity_education_of_bo_trading), EducationOfBPTradingAdapter.OnItemClickListener{

    private val educationofbotradingAdapter: EducationOfBPTradingAdapter = EducationOfBPTradingAdapter(this,Constants.dataEducationOfBOTrading)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Paper.init(this)
        initViews()
        initListeners()
    }

    private fun initViews() {
        rv_educationofbotrading.adapter = educationofbotradingAdapter
        rv_educationofbotrading.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rv_educationofbotrading.addOnScrollListener(object : RecyclerView.OnScrollListener() {
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
        btn_back.setOnClickListener{
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

    override fun listenerClickItem(id: Int) {
        Paper.book().write("id", id)
        startActivity(Intent(this, ArticleActivity::class.java))
        finish()
    }
}