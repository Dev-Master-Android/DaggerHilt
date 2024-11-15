package com.example.daggerhilt.domain

import com.example.daggerhilt.data.model.Currency
import com.example.daggerhilt.data.repository.CurrencyRepository
import javax.inject.Inject


class GetCurrenciesUseCase @Inject constructor(private val repository: CurrencyRepository) {
    fun execute(): List<Currency> {
        return repository.getAllCurrencies()
    }
}
