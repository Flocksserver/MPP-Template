package de.flocksserver.mpp.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import de.flocksserver.mpp.di.components.ApplicationComponent
import de.flocksserver.mpp.di.components.app

/**
 * Created by marcel on 08.08.17.
 */
abstract class BaseActivity : AppCompatActivity() {

    abstract fun getLayoutResource(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResource())
    }

    protected fun replaceFragment(containerViewId: Int, fragment: Fragment, tag: String) {
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(containerViewId, fragment, tag)
        fragmentTransaction.commit()
    }

    protected fun getApplicationComponent(): ApplicationComponent {
        return app()
    }

}
