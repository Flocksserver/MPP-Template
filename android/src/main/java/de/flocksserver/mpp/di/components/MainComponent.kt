package de.flocksserver.mpp.di.components

import dagger.Component
import de.flocksserver.mpp.ui.MainActivity
import de.flocksserver.mpp.ui.items.ItemsFragment
import de.flocksserver.mpp.ui.settings.SettingsFragment
import de.flocksserver.mpp.di.modules.ActivityModule
import de.flocksserver.mpp.di.modules.MainModule
import de.flocksserver.mpp.di.scope.PerFragment

@PerFragment
@Component(dependencies = [ApplicationComponent::class],
        modules = [ActivityModule::class, MainModule::class])
interface MainComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(itemsFragment: ItemsFragment)

    fun inject(settingsFragment: SettingsFragment)

}