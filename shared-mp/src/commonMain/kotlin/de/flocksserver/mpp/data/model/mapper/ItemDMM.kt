package de.flocksserver.mpp.data.model.mapper

import de.flocksserver.mpp.data.model.ItemDataModel
import de.flocksserver.mpp.data.model.ItemModel

class ItemDMM: BaseMapperDMM<ItemModel, ItemDataModel>() {

    override fun transformDMtoM(dataModel: ItemDataModel?): ItemModel? {
        if (dataModel != null) {
            return ItemModel(
                    id = dataModel.id,
                    text = dataModel.text
            )
        }
        return null
    }

    override fun transformMtoDM(model: ItemModel?): ItemDataModel? {
        return null
    }

}