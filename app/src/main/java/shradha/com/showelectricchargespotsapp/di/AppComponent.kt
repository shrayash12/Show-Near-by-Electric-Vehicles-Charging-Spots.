package shradha.com.showelectricchargespotsapp.di

import dagger.Component
import shradha.com.showelectricchargespotsapp.ui.MainActivity

@Component(modules = [NetworkModule::class, FeatureModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }

    fun inject(activity: MainActivity)
}