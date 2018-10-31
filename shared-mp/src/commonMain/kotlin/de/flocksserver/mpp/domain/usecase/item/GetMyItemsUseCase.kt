package de.flocksserver.mpp.domain.usecase.item

import de.flocksserver.mpp.data.model.ItemsModel
import de.flocksserver.mpp.domain.repository.ItemRepository
import de.flocksserver.mpp.domain.usecase.base.ReceiveUseCase

class GetMyItemsUseCase(private val repository: ItemRepository) :
        ReceiveUseCase<ItemsModel?>() {

    override fun buildUseCaseReceiver(): ItemsModel? {
        return repository.getItems()
    }


}