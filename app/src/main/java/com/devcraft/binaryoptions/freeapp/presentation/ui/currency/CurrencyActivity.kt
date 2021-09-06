package com.devcraft.binaryoptions.freeapp.presentation.ui.currency

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.app.Constants
import com.devcraft.binaryoptions.freeapp.presentation.ui.currencyConverter.CurrencyConverterActivity
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_single_currency_list.*

class CurrencyActivity : AppCompatActivity(R.layout.activity_single_currency_list),
    CurrencyBaseAndToAdapter.OnItemClickListener {

    private val currencyBaseAndToAdapter: CurrencyBaseAndToAdapter =
        CurrencyBaseAndToAdapter(this, Constants.currencies)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Paper.init(this)
        initViews()
        initListeners()
    }

    private fun initViews() {
        rv_single_currency_list.adapter = currencyBaseAndToAdapter
        rv_single_currency_list.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun initListeners() {
        btn_close.setOnClickListener {
            val animScale = AnimationUtils.loadAnimation(applicationContext, R.anim.other_btn)
            it.startAnimation(animScale)
            startActivity(Intent(this, CurrencyConverterActivity::class.java))
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, CurrencyConverterActivity::class.java))
        finish()
    }

    override fun listenerClickItem(idFrom: Int, idTo: Int) {
        if (intent.getIntExtra("CODE1", 0) == 1) {
            Paper.book().write("ID_CURRENCY_FROM", idFrom)
            startActivity(Intent(this, CurrencyConverterActivity::class.java))
            finish()
        }
        if (intent.getIntExtra("CODE2", 0) == 1) {
            Paper.book().write("ID_CURRENCY_TO", idTo)
            startActivity(Intent(this, CurrencyConverterActivity::class.java))
            finish()
        }
    }
}