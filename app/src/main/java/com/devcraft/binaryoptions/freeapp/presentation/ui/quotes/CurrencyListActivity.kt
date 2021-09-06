package com.devcraft.binaryoptions.freeapp.presentation.ui.quotes

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.app.Constants
import com.devcraft.binaryoptions.freeapp.presentation.ui.main.MainActivity
import com.devcraft.binaryoptions.freeapp.viewModels.CurrencyViewModel
import kotlinx.android.synthetic.main.activity_currencies_list.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class CurrencyListActivity : AppCompatActivity(R.layout.activity_currencies_list) {

    private val currencyListViewModel by viewModel<CurrencyViewModel>()
    private val currencyListAdapter: CurrencyListAdapter = CurrencyListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initListeners()
        initViews()
        initObservers()

        currencyListViewModel.loadData(Constants.currenciesPair)
    }

    private fun initViews() {
        rv_currency_list.adapter = currencyListAdapter
        rv_currency_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun initListeners() {
        btn_back.setOnClickListener {
            val animScale = AnimationUtils.loadAnimation(applicationContext, R.anim.other_btn)
            it.startAnimation(animScale)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }

    private fun initObservers() {
        currencyListViewModel.currencies.observe(this, {
            currencyListAdapter.items = it
        })
        currencyListViewModel.getCurrencyFailure.observe(this, {
            Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
