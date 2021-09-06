package com.devcraft.binaryoptions.freeapp.data.mappers

import com.devcraft.binaryoptions.freeapp.data.dto.GetCurrencyListResponse
import com.devcraft.binaryoptions.freeapp.entities.Currency


class GetCurrencyMapper {
    fun mapDtoToEntity(dto: List<GetCurrencyListResponse>): MutableList<Currency> {
        return dto.map {
            Currency(
                it.symbol,
                it.lasttime,
                it.change,
                it.ask
            )
        }.toMutableList()
    }
}