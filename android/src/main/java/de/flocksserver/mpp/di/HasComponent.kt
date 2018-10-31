package de.flocksserver.mpp.di

interface HasComponent<C> {
    fun getComponent(): C
}