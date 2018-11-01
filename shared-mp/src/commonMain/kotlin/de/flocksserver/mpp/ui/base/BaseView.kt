package de.flocksserver.mpp.ui.base

import de.flocksserver.mpp.domain.UIContext

/**
 * Created by marcel on 08.08.17.
 */
interface BaseView {
    fun error(error: String)
    fun getUIThread(): UIContext
}