package de.flocksserver.mpp.ui.items


import de.flocksserver.mpp.data.model.ItemsModel
import de.flocksserver.mpp.domain.model.BaseViewModel
import de.flocksserver.mpp.ui.base.BasePresenter
import de.flocksserver.mpp.ui.base.BaseView

/**
 * Created by marcel on 24.07.17.
 */
interface ItemsContract {
    interface View : BaseView {
        var itemsViewModel: BaseViewModel?
        fun setItems(model: ItemsModel)
        fun setHeaderTitle()
    }

    interface Presenter : BasePresenter<View> {
        fun showItems()
    }
}