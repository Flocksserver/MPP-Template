package de.flocksserver.mpp.model.mapper

import de.flocksserver.mpp.data.model.ItemsModel
import de.flocksserver.mpp.model.ItemsViewModel
import javax.inject.Inject

class ItemsMVM @Inject constructor(
        private val itemMVM: ItemMVM
) : BaseMapperMVM<ItemsViewModel, ItemsModel>() {

    override fun transformMtoVM(model: ItemsModel?): ItemsViewModel? {
        if (model != null) {
            return ItemsViewModel(itemMVM.transformMtoVM(model.items))
        }
        return null
    }

    override fun transformVMtoM(viewModel: ItemsViewModel?): ItemsModel? {
        if (viewModel != null) {
            return ItemsModel(itemMVM.transformVMtoM(viewModel.items))
        }
        return null
    }

}