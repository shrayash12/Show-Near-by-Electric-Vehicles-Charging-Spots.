package shradha.com.showelectricchargespotsapp.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import shradha.com.showelectricchargespotsapp.data.ElectricChargeSpotRepository
import shradha.com.showelectricchargespotsapp.data.model.ChargingSpotResponse
import shradha.com.showelectricchargespotsapp.data.model.ChargingStationInfo

class ElectricChargeSpotViewModel(private val electricChargeSpotRepository: ElectricChargeSpotRepository) :
    ViewModel() {

    private val _chargeSpots = MutableLiveData<List<ChargingStationInfo>>()
    val chargeSpots: LiveData<List<ChargingStationInfo>> = _chargeSpots

    fun getNearByChargingSpot(lat: Double, long: Double) {
        viewModelScope.launch {
            val getChargeSpots = electricChargeSpotRepository.getNearByChargingSpots(lat, long)
            _chargeSpots.postValue(
                ChargingMapper.mapChargingSportResponseToCharInfo(
                    getChargeSpots,
                    lat,
                    long
                )
            )
        }
    }
}