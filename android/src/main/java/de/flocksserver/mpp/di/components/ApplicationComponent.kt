package de.flocksserver.mpp.di.components

import android.content.Context
import dagger.Component
import de.flocksserver.mpp.App
import de.flocksserver.mpp.di.scope.PerApplication
import de.flocksserver.mpp.domain.UIContext
import de.flocksserver.mpp.domain.repository.ItemRepository

import de.flocksserver.mpp.di.modules.ApplicationModule

fun app() = ApplicationComponent.instance

@PerApplication
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(androidApplication: App)

    val androidApplication: App

    fun context(): Context

    fun itemsRepository(): ItemRepository

    fun postExecutionThread(): UIContext

    companion object {
        lateinit var instance: ApplicationComponent
    }

}