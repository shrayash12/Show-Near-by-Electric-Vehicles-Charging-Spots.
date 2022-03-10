package shradha.com.showelectricchargespotsapp.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import shradha.com.showelectricchargespotsapp.ui.util.Constants

object ChargingSpoApi {
    private val retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun createService(): ElectChargeSpotService {
        return retrofit.create(ElectChargeSpotService::class.java)
    }
}