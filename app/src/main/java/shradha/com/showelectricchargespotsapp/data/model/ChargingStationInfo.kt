package shradha.com.showelectricchargespotsapp.data.model

data class ChargingStationInfo(
    val lat: Double,
    val long: Double,
    val country: String,
    val title: String,
    val distance: Double?
)