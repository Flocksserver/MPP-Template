package de.flocksserver.mpp.domain.usecase.base

class ActionReceiver<T>(private val f: (T?) -> Unit){
    fun invoke(p1: T) {
        f.invoke(p1)
    }
}
