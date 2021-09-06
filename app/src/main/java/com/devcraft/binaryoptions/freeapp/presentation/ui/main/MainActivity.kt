package com.devcraft.binaryoptions.freeapp.presentation.ui.main

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.app.Constants
import com.devcraft.binaryoptions.freeapp.presentation.ui.aboutIUsActivity.AboutUsActivity
import com.devcraft.binaryoptions.freeapp.presentation.ui.currencyConverter.CurrencyConverterActivity
import com.devcraft.binaryoptions.freeapp.presentation.ui.educationOfBOTrading.EducationOfBOTradingActivity
import com.devcraft.binaryoptions.freeapp.presentation.ui.golossary.GolossaryActivity
import com.devcraft.binaryoptions.freeapp.presentation.ui.quotes.CurrencyListActivity
import com.devcraft.binaryoptions.freeapp.viewModels.CurrencyViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val currenciesAdapter: CurrenciesAdapter = CurrenciesAdapter()
    private val currencyViewModel: CurrencyViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initListeners()
        initViews()
        initObservers()
        currencyViewModel.loadData(Constants.currenciesPair)
    }

    private fun initViews() {
        rv_currency_h.adapter = currenciesAdapter
        rv_currency_h.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun initListeners() {
        btn_golossary.setOnClickListener {
            startActivity(Intent(this, GolossaryActivity::class.java))
            finish()
        }

        btn_converter.setOnClickListener {
            startActivity(Intent(this, CurrencyConverterActivity::class.java))
            finish()
        }

        btn_education_of_bo_trading.setOnClickListener {
            startActivity(Intent(this, EducationOfBOTradingActivity::class.java))
            finish()
        }

        btn_see_more.setOnClickListener {
            val animScale = AnimationUtils.loadAnimation(this, R.anim.other_btn)
            it.startAnimation(animScale)
            startActivity(Intent(this, CurrencyListActivity::class.java))
            btn_see_more.setTextColor(Color.parseColor("#FFFFFF"))
            finish()
        }


        btn_about.setOnClickListener {
            startActivity(Intent(this, AboutUsActivity::class.java))
            finish()
        }

    }

    private fun initObservers() {
        currencyViewModel.currencies.observe(this, {
            currenciesAdapter.items = it
        })
        currencyViewModel.getCurrencyFailure.observe(this, {
            Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
        })
    }
}