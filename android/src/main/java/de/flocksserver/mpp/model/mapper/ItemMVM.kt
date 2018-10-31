package de.flocksserver.mpp.model.mapper

import de.flocksserver.mpp.data.model.ItemModel
import de.flocksserver.mpp.model.ItemViewModel
import javax.inject.Inject

class ItemMVM @Inject constructor() : BaseMapperMVM<ItemViewModel, ItemModel>() {

    override fun transformMtoVM(model: ItemModel?): ItemViewModel? {
        if (model != null) {
            return ItemViewModel(
                    id = model.id.toString(),
                    text = model.text,
                    isImportant = model.id == 2
            )
        }
        return null
    }

    override fun transformVMtoM(viewModel: ItemViewModel?): ItemModel? {
        return null
    }

}