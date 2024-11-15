package com.example.daggerhilt.data.repository

import com.example.daggerhilt.data.model.Currency

interface CurrencyRepository {
    fun getAllCurrencies(): List<Currency>
    fun getCurrencyByCode(currencyCode: String): Currency?
}
