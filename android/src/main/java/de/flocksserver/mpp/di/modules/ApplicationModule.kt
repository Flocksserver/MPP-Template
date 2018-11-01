package de.flocksserver.mpp.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import de.flocksserver.mpp.App
import de.flocksserver.mpp.di.scope.PerApplication
import de.flocksserver.mpp.UIThread
import de.flocksserver.mpp.data.service.CustomItemService
import de.flocksserver.mpp.domain.UIContext
import de.flocksserver.mpp.domain.repository.ItemRepository


@Module
class ApplicationModule(private val androidApplication: App) {

    @Provides
    @PerApplication
    fun application(): App {
        return androidApplication
    }

    @Provides
    @PerApplication
    fun provideApplicationContext(): Context {
        return androidApplication
    }


    @Provides
    @PerApplication
    fun providePostExecutionThread(uiThread: UIThread): UIContext {
        return uiThread
    }


    @Provides
    @PerApplication
    fun providesItemRepository(): ItemRepository {
        return CustomItemService()
    }

}
