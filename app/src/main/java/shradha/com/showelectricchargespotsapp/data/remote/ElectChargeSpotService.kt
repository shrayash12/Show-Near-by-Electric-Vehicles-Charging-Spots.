package shradha.com.showelectricchargespotsapp.data.remote

import retrofit2.http.GET
import retrofit2.http.QueryMap
import shradha.com.showelectricchargespotsapp.data.model.ChargingSpotResponse
import shradha.com.showelectricchargespotsapp.ui.util.Constants

interface ElectChargeSpotService {
    @GET(Constants.PATH)
    suspend fun getChargingSpots(
        @QueryMap map: HashMap<String, String>
    ): List<ChargingSpotResponse>
}
