package de.flocksserver.mpp.ui.settings


import de.flocksserver.mpp.ui.base.BasePresenter


/**
 * Created by marcel on 24.07.17.
 */
class SettingsPresenter: BasePresenter<SettingsContract.View>, SettingsContract.Presenter {

    override var view: SettingsContract.View? = null

    override fun resume() {
        view?.setHeaderTitle()
    }

    override fun pause() {
    }

    override fun destroy() {
        view = null
    }
}