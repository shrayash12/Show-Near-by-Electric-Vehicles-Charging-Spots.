package shradha.com.showelectricchargespotsapp.domain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import shradha.com.showelectricchargespotsapp.data.ElectricChargeSpotRepository

class ElectricChargeSpotViewModelFactory(private val electricChargeSpotRepository: ElectricChargeSpotRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ElectricChargeSpotViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ElectricChargeSpotViewModel(electricChargeSpotRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}