package shradha.com.showelectricchargespotsapp.domain

import shradha.com.showelectricchargespotsapp.data.model.ChargingSpotResponse
import shradha.com.showelectricchargespotsapp.data.model.ChargingStationInfo
import shradha.com.showelectricchargespotsapp.ui.util.Utility

object ChargingMapper {
    fun mapChargingSportResponseToCharInfo(
        list: List<ChargingSpotResponse>,
        lat1: Double,
        long1: Double,
    ): List<ChargingStationInfo> {
        return list.map {
            ChargingStationInfo(
                it.addressInfo.latitude,
                it.addressInfo.longitude,
                it.addressInfo.title,
                it.operatorInfo.title,
                distance = Utility.calculateDistance(
                    lat1 = lat1,
                    lon1 = long1,
                    lat2 = it.addressInfo.latitude,
                    lon2 = it.addressInfo.longitude
                )
            )
        }.sortedBy { it.distance }
    }
}