package shradha.com.showelectricchargespotsapp.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import shradha.com.showelectricchargespotsapp.domain.ElectricChargeSpotViewModel

@Module
abstract class FeatureModule {
    @Binds
    @IntoMap
    @ViewModelKey(ElectricChargeSpotViewModel::class)
    abstract fun electricChargeSpotViewModel(
        stockItemViewModel: ElectricChargeSpotViewModel
    ): ElectricChargeSpotViewModel
}