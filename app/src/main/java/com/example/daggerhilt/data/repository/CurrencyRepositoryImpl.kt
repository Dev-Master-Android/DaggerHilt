package com.example.daggerhilt.data.repository

import com.example.daggerhilt.data.model.Currency
import com.example.daggerhilt.R

class CurrencyRepositoryImpl : CurrencyRepository {
    private val currencies = listOf(
        Currency("USD", R.drawable.usd),
        Currency("EUR", R.drawable.eur),
        Currency("JPY", R.drawable.jpy),
        Currency("RUB", R.drawable.rub)
    )

    override fun getAllCurrencies(): List<Currency> {
        return currencies
    }

    override fun getCurrencyByCode(currencyCode: String): Currency? {
        return currencies.find { it.currencyCode == currencyCode }
    }
}
