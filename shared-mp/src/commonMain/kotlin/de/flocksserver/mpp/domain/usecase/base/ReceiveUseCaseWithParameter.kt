package de.flocksserver.mpp.domain.usecase.base


/**
 * Created by marcel on 01.08.17.
 */
abstract class ReceiveUseCaseWithParameter<T, in Params> {

    internal abstract fun buildUseCaseReceiver(params: Params): T?

    fun execute(actionReceiver: ActionReceiver<T?>, params: Params) {

        actionReceiver.invoke(buildUseCaseReceiver(params))

    }

}