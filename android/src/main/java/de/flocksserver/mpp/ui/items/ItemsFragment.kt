package de.flocksserver.mpp.ui.items

import android.graphics.Typeface
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import de.flocksserver.mpp.R
import de.flocksserver.mpp.UIThread
import de.flocksserver.mpp.base.BaseFragment
import de.flocksserver.mpp.data.model.ItemsModel
import de.flocksserver.mpp.di.components.MainComponent
import de.flocksserver.mpp.di.components.app
import de.flocksserver.mpp.domain.UIContext
import de.flocksserver.mpp.domain.model.BaseViewModel
import de.flocksserver.mpp.domain.usecase.item.GetMyItemsUseCase
import de.flocksserver.mpp.model.ItemsViewModel
import de.flocksserver.mpp.model.mapper.ItemMVM
import kotlinx.android.synthetic.main.fragment_items.*
import de.flocksserver.mpp.model.mapper.ItemsMVM
import de.flocksserver.mpp.util.ViewIdGenerator
import kotlinx.coroutines.CoroutineDispatcher
import kotlin.coroutines.*

/**
 * Created by marcel on 24.07.17.
 */
class ItemsFragment : BaseFragment(), ItemsContract.View {

    private val itemsPresenter = ItemsPresenter(
            GetMyItemsUseCase(
                    repository = app().itemsRepository()
            ),
            getUIThread()
    )
    private val itemsMapperMVM = ItemsMVM(ItemMVM())
    override var itemsViewModel: BaseViewModel? = null

    override fun getLayoutResource(): Int {
        return R.layout.fragment_items
    }

    companion object {
        fun newInstance(): ItemsFragment {
            return ItemsFragment()
        }
    }

    override fun onResume() {
        super.onResume()
        itemsPresenter.resume()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        itemsPresenter.destroy()
    }

    override fun initialize() {
        this.getComponent(MainComponent::class.java).inject(this)
        itemsPresenter.view = this
    }

    override fun setHeaderTitle() {
        val actionbar: ActionBar? = (activity as AppCompatActivity).supportActionBar
        actionbar?.apply {
            setTitle(R.string.title_items)
        }
    }

    override fun setItems(model: ItemsModel) {
        itemsViewModel = itemsMapperMVM.transformMtoVM(model)
        activity?.invalidateOptionsMenu()
        createItems(itemsViewModel as ItemsViewModel)
        progress_bar.visibility = View.GONE
        contentLayout.visibility = View.VISIBLE
    }

    private fun createItems(itemsViewModel: ItemsViewModel) {
        content.removeAllViews()
        itemsViewModel.items.forEach{ item ->
            val itemText = TextView(context)
            itemText.id = ViewIdGenerator.generateViewId()
            itemText.text = item.text
            itemText.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                resources.getDimensionPixelSize(R.dimen.txt_size).toFloat()
            )
            if (item.isImportant) itemText.setTypeface(null, Typeface.BOLD)
            itemText.gravity = Gravity.CENTER
            content.addView(itemText)
        }
    }


    override fun error(error: String) {
        Toast.makeText(context, error, Toast.LENGTH_SHORT).show()
    }

    override fun getUIThread(): UIContext {
        return app().postExecutionThread()
    }

}