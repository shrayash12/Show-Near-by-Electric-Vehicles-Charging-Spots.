package shradha.com.showelectricchargespotsapp.di

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import shradha.com.showelectricchargespotsapp.data.ElectricChargeSpotRepository
import shradha.com.showelectricchargespotsapp.data.ElectricChargeSpotRepositoryImpl
import shradha.com.showelectricchargespotsapp.data.remote.ElectChargeSpotService
import shradha.com.showelectricchargespotsapp.ui.util.Constants

@Module
class NetworkModule {
    @Provides
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideService(retrofit: Retrofit): ElectChargeSpotService =
        retrofit.create(ElectChargeSpotService::class.java)

    @Provides
    fun provideRepo(electChargeSpotService: ElectChargeSpotService): ElectricChargeSpotRepository =
        ElectricChargeSpotRepositoryImpl(Dispatchers.IO, electChargeSpotService)
}