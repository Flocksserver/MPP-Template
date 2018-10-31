package de.flocksserver.mpp.ui.base

import kotlin.coroutines.CoroutineContext

/**
 * Created by marcel on 08.08.17.
 */
interface BaseView {
    fun error(error: String)
    fun getUIThread(): CoroutineContext
}