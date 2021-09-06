package com.devcraft.binaryoptions.freeapp.entities

data class Currency(
    var symbol: String,
    var datetime: Long,
    var percent_change: Double,
    var close: Double
)