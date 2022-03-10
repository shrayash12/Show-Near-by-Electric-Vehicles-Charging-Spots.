package shradha.com.showelectricchargespotsapp.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import shradha.com.showelectricchargespotsapp.data.ElectricChargeSpotRepository
import shradha.com.showelectricchargespotsapp.data.model.ChargingStationInfo
import javax.inject.Inject

class ElectricChargeSpotViewModel @Inject constructor(
    private val electricChargeSpotRepository: ElectricChargeSpotRepository
) : ViewModel() {

    private val _chargeSpots = MutableLiveData<List<ChargingStationInfo>>()
    val chargeSpots: LiveData<List<ChargingStationInfo>> = _chargeSpots

    fun getNearByChargingSpot(lat: Double, long: Double, maxResult: String) {
        viewModelScope.launch {
            val getChargeSpots = electricChargeSpotRepository.getNearByChargingSpots(lat, long, maxResult)
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