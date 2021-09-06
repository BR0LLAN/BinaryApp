package com.devcraft.binaryoptions.freeapp.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.devcraft.binaryoptions.freeapp.app.Constants
import com.devcraft.binaryoptions.freeapp.common.SingleLiveEvent
import com.devcraft.binaryoptions.freeapp.data.dto.GetCurrencyListResponse
import com.devcraft.binaryoptions.freeapp.data.mappers.GetCurrencyMapper
import com.devcraft.binaryoptions.freeapp.data.retrofitApi.QuotesApi
import com.devcraft.binaryoptions.freeapp.entities.Currency
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CurrencyViewModel(
    private val quotesApi: QuotesApi,
    private val getCurrencyMapper: GetCurrencyMapper
) : ViewModel()

{
    val currencies: MutableLiveData<MutableList<Currency>> = MutableLiveData(
        mutableListOf())

    val getCurrencyFailure: SingleLiveEvent<Throwable> = SingleLiveEvent()

    fun loadData(query: MutableList<String>){
        quotesApi.getQuotes(query.joinToString(separator= ","))
            .enqueue(object : Callback<List<GetCurrencyListResponse>>{
                override fun onResponse(
                    call: Call<List<GetCurrencyListResponse>>,
                    response: Response<List<GetCurrencyListResponse>>
                ) {

                    if (response.isSuccessful && response.body() != null) {
                        currencies.postValue(getCurrencyMapper.mapDtoToEntity(response.body()!!))
                    } else {
                        getCurrencyFailure.postValue(Error("something get wrong, response code: ${response.code()}"))
                    }
                }

                override fun onFailure(call: Call<List<GetCurrencyListResponse>>, t: Throwable) {
                    getCurrencyFailure.postValue(t)
                }
            })
    }

}
