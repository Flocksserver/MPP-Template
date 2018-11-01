package de.flocksserver.mpp.domain

import kotlinx.coroutines.CoroutineDispatcher

interface UIContext {
    val context: CoroutineDispatcher
}