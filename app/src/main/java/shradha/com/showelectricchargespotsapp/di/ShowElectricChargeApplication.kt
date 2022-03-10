package shradha.com.showelectricchargespotsapp.di

import android.app.Application

class ShowElectricChargeApplication : Application() {
    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    private fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create()
    }
}