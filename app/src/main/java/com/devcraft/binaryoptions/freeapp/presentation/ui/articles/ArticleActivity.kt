package com.devcraft.binaryoptions.freeapp.presentation.ui.articles

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.app.Constants
import com.devcraft.binaryoptions.freeapp.presentation.ui.educationOfBOTrading.EducationOfBOTradingActivity
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_article.*

class ArticleActivity : AppCompatActivity(R.layout.activity_article){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Paper.init(this)
        initView()
        initListeners()
    }

    private fun initView() {
        if(Paper.book().contains("id")){
            val item = Paper.book().read<Int>("id")

            article_img.setBackgroundResource( Constants.dataEducationOfBOTrading[item].article.articleImg)

            article_title.text = Constants.dataEducationOfBOTrading[item].article.articleTitle

            article_content.text = Constants.dataEducationOfBOTrading[item].article.articleContent

            if (Constants.dataEducationOfBOTrading[item].article.articleChart != 0 && Constants.dataEducationOfBOTrading[item].article.articleContentAfter != ""){

                article_chart.setBackgroundResource(Constants.dataEducationOfBOTrading[item].article.articleChart)

                article_content_after.text = Constants.dataEducationOfBOTrading[item].article.articleContentAfter
            }
        }
    }

    private fun initListeners() {
        btn_close.setOnClickListener{
            val animScale = AnimationUtils.loadAnimation(applicationContext, R.anim.other_btn)
            it.startAnimation(animScale)
            startActivity(Intent(this, EducationOfBOTradingActivity::class.java))
            Paper.book().delete("id")
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, EducationOfBOTradingActivity::class.java))
        Paper.book().delete("id")
        finish()
    }
}