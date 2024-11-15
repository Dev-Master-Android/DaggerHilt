package com.example.daggerhilt.di

import com.example.daggerhilt.data.repository.CurrencyRepository
import com.example.daggerhilt.data.repository.CurrencyRepositoryImpl
import com.example.daggerhilt.domain.GetCurrenciesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCurrencyRepository(): CurrencyRepository {
        return CurrencyRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideGetCurrenciesUseCase(repository: CurrencyRepository): GetCurrenciesUseCase {
        return GetCurrenciesUseCase(repository)
    }
}
