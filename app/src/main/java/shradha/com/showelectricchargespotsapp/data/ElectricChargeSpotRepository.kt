package shradha.com.showelectricchargespotsapp.data

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import shradha.com.showelectricchargespotsapp.data.model.ChargingSpotResponse
import shradha.com.showelectricchargespotsapp.data.remote.ChargingSpoApi
import shradha.com.showelectricchargespotsapp.ui.util.Constants

interface ElectricChargeSpotRepository {
    suspend fun getNearByChargingSpots(lat: Double, long: Double): List<ChargingSpotResponse>
}

class ElectricChargeSpotRepositoryImpl(private val dispatcher: CoroutineDispatcher) :
    ElectricChargeSpotRepository {
    override suspend fun getNearByChargingSpots(lat: Double, long: Double) =
        withContext(dispatcher) {
            val map = HashMap<String, String>()
            map[Constants.KEY_OUTPUT] = "json"
            map[Constants.KEY_MAX_RESULTS] = "10"
            map[Constants.KEY_KEY] = "5a8d43c3-b839-45bd-a80d-0f7c207d328a"
            map[Constants.KEY_LATITUDE] = lat.toString()
            map[Constants.KEY_LONGITUDE] = long.toString()
            return@withContext ChargingSpoApi.createService().getChargingSpots(map)
        }
}
