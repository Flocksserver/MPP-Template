package de.flocksserver.mpp

import android.app.Application
import android.content.Context
import de.flocksserver.mpp.di.components.ApplicationComponent
import de.flocksserver.mpp.di.components.DaggerApplicationComponent
import de.flocksserver.mpp.di.modules.ApplicationModule

/**
 * Created by marcel on 19.06.17.
 */
open class App : Application() {


    override fun onCreate() {
        super.onCreate()
        ApplicationComponent.instance = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
        ApplicationComponent.instance.inject(this)
    }

    companion object {
        operator fun get(context: Context): App {
            return context.applicationContext as App
        }
    }
}