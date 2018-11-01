package de.flocksserver.mpp.ui.settings

import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import de.flocksserver.mpp.R
import de.flocksserver.mpp.base.BaseFragment
import de.flocksserver.mpp.di.components.MainComponent
import de.flocksserver.mpp.di.components.app
import de.flocksserver.mpp.domain.UIContext
import kotlinx.coroutines.CoroutineDispatcher
import kotlin.coroutines.CoroutineContext

/**
 * Created by marcel on 24.07.17.
 */
class SettingsFragment : BaseFragment(), SettingsContract.View {


    private val settingsPresenter = SettingsPresenter()

    override fun getLayoutResource(): Int {
        return R.layout.fragment_settings
    }

    companion object {
        fun newInstance(): SettingsFragment {
            return SettingsFragment()
        }
    }

    override fun onResume() {
        super.onResume()
        settingsPresenter.resume()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        settingsPresenter.destroy()
    }

    override fun initialize() {
        this.getComponent(MainComponent::class.java).inject(this)
        settingsPresenter.view = this
    }

    override fun setHeaderTitle() {
        val actionbar: ActionBar? = (activity as AppCompatActivity).supportActionBar
        actionbar?.apply {
            setTitle(R.string.title_settings)
        }
    }

    override fun getUIThread(): UIContext {
        return app().postExecutionThread()
    }

    override fun error(error: String) {
        Toast.makeText(context, error, Toast.LENGTH_SHORT).show()
    }
}