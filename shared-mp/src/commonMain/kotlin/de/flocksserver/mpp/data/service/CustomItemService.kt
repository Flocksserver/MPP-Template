package de.flocksserver.mpp.data.service

import de.flocksserver.mpp.data.model.ItemDataModel
import de.flocksserver.mpp.data.model.ItemsDataModel
import de.flocksserver.mpp.data.model.ItemsModel
import de.flocksserver.mpp.data.model.mapper.ItemDMM
import de.flocksserver.mpp.data.model.mapper.ItemsDMM
import de.flocksserver.mpp.domain.repository.ItemRepository
import kotlin.collections.ArrayList

class CustomItemService: ItemRepository {

    private val itemsDMM: ItemsDMM = ItemsDMM(ItemDMM())

    override fun getItems(): ItemsModel? {
        return createItems()
    }

    private fun createItems(): ItemsModel? {
        val list = ArrayList<ItemDataModel>()
        list.add(ItemDataModel(0, "Hello"))
        list.add(ItemDataModel(1, "World"))
        list.add(ItemDataModel(2, "Kotlin MPP"))
        return itemsDMM.transformDMtoM(ItemsDataModel(list))
    }

}