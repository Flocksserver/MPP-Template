package de.flocksserver.mpp.data.model.mapper

/**
 * Created by marcel on 08.08.17.
 */
abstract class BaseMapperDMM<Model, DataModel> {



    abstract fun transformDMtoM(dataModel: DataModel?): Model?

    fun transformDMtoM(collection: List<DataModel>?): ArrayList<Model> {
        val list = ArrayList<Model>()
        var model: Model?
        for (entity in collection!!) {
            model = transformDMtoM(entity)
            if (model != null) {
                list.add(model)
            }
        }
        return list
    }
    abstract fun transformMtoDM(model: Model?): DataModel?

    fun transformMtoDM(collection: List<Model>?): ArrayList<DataModel> {
        val list = ArrayList<DataModel>()
        var model: DataModel?
        for (entity in collection!!) {
            model = transformMtoDM(entity)
            if (model != null) {
                list.add(model)
            }
        }
        return list
    }
}