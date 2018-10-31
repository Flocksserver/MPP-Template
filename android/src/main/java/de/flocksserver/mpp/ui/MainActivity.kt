package de.flocksserver.mpp.ui

import android.os.Bundle
import de.flocksserver.mpp.R
import kotlinx.android.synthetic.main.activity_main.*
import de.flocksserver.mpp.base.BaseActivity
import de.flocksserver.mpp.ui.items.ItemsFragment
import de.flocksserver.mpp.ui.settings.SettingsFragment
import de.flocksserver.mpp.di.HasComponent
import de.flocksserver.mpp.di.components.DaggerMainComponent
import de.flocksserver.mpp.di.components.MainComponent
import de.flocksserver.mpp.di.modules.MainModule

/**
 * Created by marcel on 24.07.17.
 */class MainActivity : BaseActivity(), HasComponent<MainComponent> {

    var currentFragmentTag: String? = null

    override fun getLayoutResource(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeActivity()
    }

    private fun initializeActivity() {

        currentFragmentTag = if (currentFragmentTag == null) resources.getString(R.string.title_items) else currentFragmentTag


        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_items -> {
                    currentFragmentTag = resources.getString(R.string.title_items)
                    replaceFragment(R.id.container, ItemsFragment.newInstance(), currentFragmentTag as String)
                }
                R.id.navigation_settings -> {
                    currentFragmentTag = resources.getString(R.string.title_settings)
                    replaceFragment(R.id.container, SettingsFragment.newInstance(), currentFragmentTag as String)
                }
            }
            true
        }
        replaceFragment(R.id.container, ItemsFragment.newInstance(), currentFragmentTag as String)
    }

    private val mainComponent: MainComponent
        get() = DaggerMainComponent.builder()
            .applicationComponent(getApplicationComponent())
            .mainModule(MainModule(this))
            .build()

    override fun getComponent(): MainComponent {
        return mainComponent
    }
}
