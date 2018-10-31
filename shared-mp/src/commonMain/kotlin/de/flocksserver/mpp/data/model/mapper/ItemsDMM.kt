package de.flocksserver.mpp.data.model.mapper

import de.flocksserver.mpp.data.model.ItemsDataModel
import de.flocksserver.mpp.data.model.ItemsModel

class ItemsDMM constructor(
        private val videoItemDMM: ItemDMM
) : BaseMapperDMM<ItemsModel, ItemsDataModel>() {

    override fun transformDMtoM(dataModel: ItemsDataModel?): ItemsModel? {
        if (dataModel != null) {
            return ItemsModel(videoItemDMM.transformDMtoM(dataModel.items))
        }
        return null
    }

    override fun transformMtoDM(model: ItemsModel?): ItemsDataModel? {
        return null
    }

}