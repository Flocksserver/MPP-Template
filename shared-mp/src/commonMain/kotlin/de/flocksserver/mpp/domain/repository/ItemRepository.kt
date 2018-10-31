package de.flocksserver.mpp.domain.repository

import de.flocksserver.mpp.data.model.ItemsModel


interface ItemRepository {
    fun getItems(): ItemsModel?
}