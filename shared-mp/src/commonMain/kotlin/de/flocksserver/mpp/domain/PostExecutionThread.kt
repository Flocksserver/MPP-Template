package de.flocksserver.mpp.domain

import kotlinx.coroutines.CoroutineDispatcher


interface PostExecutionThread {
    val scheduler: CoroutineDispatcher
}