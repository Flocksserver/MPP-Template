package de.flocksserver.mpp.model

import de.flocksserver.mpp.domain.model.BaseViewModel

data class ItemsViewModel(
        val items: List<ItemViewModel>
): BaseViewModel