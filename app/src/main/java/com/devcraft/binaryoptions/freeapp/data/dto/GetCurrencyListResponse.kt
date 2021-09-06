package com.devcraft.binaryoptions.freeapp.data.dto


data class GetCurrencyListResponse(
        val ask: Double,
        val change: Double,
        val symbol: String,
        val lasttime: Long
)