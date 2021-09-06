package com.devcraft.binaryoptions.freeapp.presentation.ui.currencyConverter

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.animation.AnimationUtils

import androidx.appcompat.app.AppCompatActivity
import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.app.Constants
import com.devcraft.binaryoptions.freeapp.presentation.ui.currency.CurrencyActivity
import com.devcraft.binaryoptions.freeapp.presentation.ui.main.MainActivity
import com.devcraft.binaryoptions.freeapp.viewModels.CurrencyViewModel
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_currency_converter.*
import kotlinx.android.synthetic.main.activity_education_of_bo_trading.btn_back
import org.koin.androidx.viewmodel.ext.android.viewModel

class CurrencyConverterActivity : AppCompatActivity(R.layout.activity_currency_converter) {

    private val currencyViewModel : CurrencyViewModel by viewModel()
    private var currencyValue: Double = 0.0
    private var currencyValueQuery: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Paper.init(this)
        initViews()
        initListeners()

    }

    private fun sendQuery(inputValue: Int) {
        val currencyFrom = currency_name_from.text
        val currencyTo = currency_name_to.text
        val strQuery = "$currencyFrom$currencyTo"
        val query: MutableList<String> = mutableListOf(strQuery)
        currencyViewModel.loadData(query)
        for(value in currencyViewModel.currencies.value!!){
            currencyValueQuery = value.close
            currencyValue = value.close * inputValue
            result_convert.text = String.format("%.4f", currencyValue)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun initViews() {
        firstSetResource()
        sendQuery(1)
    }

    @SuppressLint("SetTextI18n")
    private fun firstSetResource() {
        if (Paper.book().contains("ID_CURRENCY_FROM")) {
            setCurrencyFromConvert(Paper.book().read("ID_CURRENCY_FROM"))
        } else {
            currency_logo_from.setImageResource(R.drawable.ic_eur)
            currency_name_from.text = "EUR"
        }
        if (Paper.book().contains("ID_CURRENCY_TO")) {
            setCurrencyToConvert(Paper.book().read("ID_CURRENCY_TO"))
        } else {
            currency_logo_to.setImageResource(R.drawable.ic_usd)
            currency_name_to.text = "USD"
            val currencyFrom = currency_name_from.text
            val currencyTo = currency_name_to.text
            val strQuery = "$currencyFrom$currencyTo"
            val query: MutableList<String> = mutableListOf(strQuery)
            currencyViewModel.loadData(query)
            for(value in currencyViewModel.currencies.value!!){
                result_convert.text = value.close.toString()
            }
        }
    }

    private fun initListeners() {
        btn_back.setOnClickListener {
            val animScale = AnimationUtils.loadAnimation(applicationContext, R.anim.other_btn)
            it.startAnimation(animScale)
            Paper.book().delete("ID_CURRENCY_FROM")
            Paper.book().delete("ID_CURRENCY_TO")
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        multiply_icon.setOnClickListener{
            val animScale =
                AnimationUtils.loadAnimation(applicationContext, R.anim.exchange_stroke_btn)
            it.startAnimation(animScale)
        }
        currency_from.setOnClickListener {
            val intent = Intent(this, CurrencyActivity::class.java)
            intent.putExtra("CODE1", 1)
            startActivity(intent)

        }
        currency_to.setOnClickListener {
            val intent = Intent(this, CurrencyActivity::class.java)
            intent.putExtra("CODE2", 1)
            startActivity(intent)

        }
        btn_change_position_currency.setOnClickListener {
            val animScale =
                AnimationUtils.loadAnimation(applicationContext, R.anim.exchange_stroke_btn)
            it.startAnimation(animScale)

            changePositionCurrency()
        }
        input_amount_currency.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }

            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (s.isNotEmpty() && s.length <= 9 && start < s.length) {
                    sendQuery(s.toString().toInt())
                } else {
                    result_convert.text = currencyValueQuery.toString()
                }
            }
        })
    }

    @SuppressLint("SetTextI18n")
    private fun changePositionCurrency() {
        if (Paper.book().contains("ID_CURRENCY_FROM")) {
            println(Paper.book().read<Int>("ID_CURRENCY_FROM"))
            setCurrencyToConvert(Paper.book().read("ID_CURRENCY_FROM"))
        } else {
            currency_logo_to.setImageResource(R.drawable.ic_usd)
            currency_name_to.text = "USD"
        }
        if (Paper.book().contains("ID_CURRENCY_TO")) {
            println(Paper.book().read<Int>("ID_CURRENCY_TO"))
            setCurrencyFromConvert(Paper.book().read("ID_CURRENCY_TO"))
        } else {
            currency_logo_from.setImageResource(R.drawable.ic_eur)
            currency_name_from.text = "EUR"
        }
        if (Paper.book().contains("ID_CURRENCY_FROM") && Paper.book().contains("ID_CURRENCY_TO")){
            val wasValueFrom = Paper.book().read<Int>("ID_CURRENCY_FROM")
            val wasValueTo = Paper.book().read<Int>("ID_CURRENCY_TO")
            Paper.book().write("ID_CURRENCY_FROM", wasValueTo)
            Paper.book().write("ID_CURRENCY_TO", wasValueFrom)
        }else{
            currency_logo_from.setImageResource(R.drawable.ic_usd)
            currency_name_from.text = "USD"
            currency_logo_to.setImageResource(R.drawable.ic_eur)
            currency_name_to.text = "EUR"
        }
    }


    @SuppressLint("SetTextI18n")
    private fun setCurrencyFromConvert(resourceFrom: Int) {
        currency_logo_from.setImageResource(
            Constants.currencies[resourceFrom].currencyLogo
        )
        currency_name_from.text =
            Constants.currencies[resourceFrom].currencyName
    }

    @SuppressLint("SetTextI18n")
    private fun setCurrencyToConvert(resourceTo: Int) {
        currency_logo_to.setImageResource(
            Constants.currencies[resourceTo].currencyLogo
        )

        currency_name_to.text =
            Constants.currencies[resourceTo].currencyName
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Paper.book().delete("ID_CURRENCY_FROM")
        Paper.book().delete("ID_CURRENCY_TO")
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}