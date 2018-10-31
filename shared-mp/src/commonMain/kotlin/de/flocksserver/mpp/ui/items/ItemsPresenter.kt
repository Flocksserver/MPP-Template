package de.flocksserver.mpp.ui.items

import de.flocksserver.mpp.domain.usecase.base.ActionReceiver
import de.flocksserver.mpp.domain.usecase.item.GetMyItemsUseCase
import de.flocksserver.mpp.ui.base.BasePresenter
import de.flocksserver.mpp.ui.settings.SettingsContract
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

/**
 * Created by marcel on 24.07.17.
 */
class ItemsPresenter(
        private val getMyItemsUseCase: GetMyItemsUseCase,
        private val uiContext: CoroutineContext
): BasePresenter<ItemsContract.View>, ItemsContract.Presenter {

    override var view: ItemsContract.View? = null

    override fun showItems() {
        GlobalScope.launch(uiContext) {
            getMyItemsUseCase.execute(
                    ActionReceiver { items ->
                        if (items != null) {
                            view?.setItems(items)
                        }
                    }
            )
        }
    }

    private fun showError(error: Throwable){
        view?.error(error.toString())
    }


    override fun resume() {
        view?.setHeaderTitle()
        showItems()
    }

    override fun pause() {
    }

    override fun destroy() {
        view = null
    }
}