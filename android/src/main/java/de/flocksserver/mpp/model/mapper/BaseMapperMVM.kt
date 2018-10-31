package de.flocksserver.mpp.model.mapper

import java.util.ArrayList

/**
 * Created by marcel on 27.07.17.
 */
abstract class BaseMapperMVM<ViewModel, Model>{

    abstract fun transformMtoVM(model: Model?): ViewModel?

    fun transformMtoVM(collection: List<Model>?): ArrayList<ViewModel> {
        val list = ArrayList<ViewModel>()
        var model: ViewModel?
        for (entity in collection!!) {
            model = transformMtoVM(entity)
            if (model != null) {
                list.add(model)
            }
        }
        return list
    }
    abstract fun transformVMtoM(viewModel: ViewModel?): Model?

    fun transformVMtoM(collection: List<ViewModel>?): ArrayList<Model> {
        val list = ArrayList<Model>()
        var model: Model?
        for (entity in collection!!) {
            model = transformVMtoM(entity)
            if (model != null) {
                list.add(model)
            }
        }
        return list
    }
}