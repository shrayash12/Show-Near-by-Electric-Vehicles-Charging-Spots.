package shradha.com.showelectricchargespotsapp.data

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import shradha.com.showelectricchargespotsapp.data.model.ChargingSpotResponse
import shradha.com.showelectricchargespotsapp.data.remote.ElectChargeSpotService
import shradha.com.showelectricchargespotsapp.ui.util.Constants
import javax.inject.Inject

const val KEY_JSON = "json"
const val KEY_API_KEY = "5a8d43c3-b839-45bd-a80d-0f7c207d328a"

interface ElectricChargeSpotRepository {
    suspend fun getNearByChargingSpots(
        lat: Double,
        long: Double,
        maxResult: String
    ): List<ChargingSpotResponse>
}

class ElectricChargeSpotRepositoryImpl @Inject constructor(
    private val dispatcher: CoroutineDispatcher,
    private val electChargeSpotService: ElectChargeSpotService
) : ElectricChargeSpotRepository {
    override suspend fun getNearByChargingSpots(
        lat: Double,
        long: Double,
        maxResult: String
    ) =
        withContext(dispatcher) {
            val map = HashMap<String, String>()
            map[Constants.KEY_OUTPUT] = KEY_JSON
            map[Constants.KEY_MAX_RESULTS] = maxResult
            map[Constants.KEY_KEY] = KEY_API_KEY
            map[Constants.KEY_LATITUDE] = lat.toString()
            map[Constants.KEY_LONGITUDE] = long.toString()
            return@withContext electChargeSpotService.getChargingSpots(map)
        }
}
