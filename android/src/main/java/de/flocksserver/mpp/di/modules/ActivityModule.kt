package de.flocksserver.mpp.di.modules

import android.app.Activity
import dagger.Module
import dagger.Provides
import de.flocksserver.mpp.di.scope.PerActivity

@Module
class ActivityModule(private val baseActivity: Activity) {

    @Provides
    @PerActivity
    internal fun provideActivity(): Activity {
        return this.baseActivity
    }
}