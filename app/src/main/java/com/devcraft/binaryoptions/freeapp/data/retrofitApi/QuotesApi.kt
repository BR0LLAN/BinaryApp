package com.devcraft.binaryoptions.freeapp.data.retrofitApi

import com.devcraft.binaryoptions.freeapp.data.ApiConstants
import com.devcraft.binaryoptions.freeapp.data.dto.GetCurrencyListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesApi {
    @GET(ApiConstants.API_ENDPOINT_LATEST_CURRENCY)
    fun getQuotes(@Query("q") symbol: String): Call<List<GetCurrencyListResponse>>

}