package de.flocksserver.mpp

import de.flocksserver.mpp.di.scope.PerApplication
import de.flocksserver.mpp.domain.PostExecutionThread
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

/**
 * Created by marcel on 24.07.17.
 */
@PerApplication
class UIThread @Inject constructor() : PostExecutionThread {

    override val scheduler: CoroutineDispatcher
        get() = Dispatchers.Main
}