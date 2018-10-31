package de.flocksserver.mpp.domain.usecase.base


/**
 * Created by marcel on 01.08.17.
 */
abstract class ReceiveUseCase<T> {

    internal abstract fun buildUseCaseReceiver(): T?

    fun execute(actionReceiver: ActionReceiver<T?>) {
            actionReceiver.invoke(buildUseCaseReceiver())
    }

}