package de.flocksserver.mpp.di.modules

import dagger.Module
import dagger.Provides
import de.flocksserver.mpp.ui.MainActivity
/**
 * Created by marcel on 08.08.17.
 */
@Module
class MainModule(private val mainActivity: MainActivity) {

    @Provides
    internal fun provideActivity(): MainActivity {
        return this.mainActivity
    }

}