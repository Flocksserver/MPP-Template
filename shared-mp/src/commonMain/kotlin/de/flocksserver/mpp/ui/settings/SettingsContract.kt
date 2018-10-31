package de.flocksserver.mpp.ui.settings


import de.flocksserver.mpp.ui.base.BasePresenter
import de.flocksserver.mpp.ui.base.BaseView

/**
 * Created by marcel on 24.07.17.
 */
interface SettingsContract {
    interface View : BaseView {
        fun setHeaderTitle()
    }

    interface Presenter : BasePresenter<View>
}