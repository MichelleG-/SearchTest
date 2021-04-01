package com.example.searchtest.di

import com.example.searchtest.ui.SampleApp
import dagger.Component

@AppScope
@Component(
    dependencies = [DataSourceComponent::class],
    modules = [AppModule::class]
)
interface AppComponent {
    fun inject(application: SampleApp)
}
