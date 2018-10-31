package de.flocksserver.mpp.model

import de.flocksserver.mpp.domain.model.BaseViewModel

data class ItemViewModel(
        val id: String,
        val text: String,
        var isImportant: Boolean
): BaseViewModel