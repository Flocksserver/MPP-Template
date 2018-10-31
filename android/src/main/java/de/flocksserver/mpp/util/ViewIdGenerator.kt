package de.flocksserver.mpp.util

import java.util.concurrent.atomic.AtomicInteger

object ViewIdGenerator {
    private val sNextGeneratedId = AtomicInteger(1)

    fun generateViewId(): Int {
        while (true) {
            val result = sNextGeneratedId.get()
            var newValue = result + 1
            if (newValue > 0x00FFFFFF) newValue = 1
            if (sNextGeneratedId.compareAndSet(result, newValue)) {
                return result
            }
        }
    }
}