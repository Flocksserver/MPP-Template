(function (_, Kotlin, $module$kotlinx_coroutines_core) {
  'use strict';
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var ArrayList_init = Kotlin.kotlin.collections.ArrayList_init_287e2$;
  var ensureNotNull = Kotlin.ensureNotNull;
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var coroutines = $module$kotlinx_coroutines_core.kotlinx.coroutines;
  var Unit = Kotlin.kotlin.Unit;
  var COROUTINE_SUSPENDED = Kotlin.kotlin.coroutines.intrinsics.COROUTINE_SUSPENDED;
  var CoroutineImpl = Kotlin.kotlin.coroutines.CoroutineImpl;
  var launch = $module$kotlinx_coroutines_core.kotlinx.coroutines.launch_s496o7$;
  ItemDMM.prototype = Object.create(BaseMapperDMM.prototype);
  ItemDMM.prototype.constructor = ItemDMM;
  ItemsDMM.prototype = Object.create(BaseMapperDMM.prototype);
  ItemsDMM.prototype.constructor = ItemsDMM;
  GetMyItemsUseCase.prototype = Object.create(ReceiveUseCase.prototype);
  GetMyItemsUseCase.prototype.constructor = GetMyItemsUseCase;
  function ItemDataModel(id, text) {
    this.id = id;
    this.text = text;
  }
  ItemDataModel.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ItemDataModel',
    interfaces: []
  };
  ItemDataModel.prototype.component1 = function () {
    return this.id;
  };
  ItemDataModel.prototype.component2 = function () {
    return this.text;
  };
  ItemDataModel.prototype.copy_19mbxw$ = function (id, text) {
    return new ItemDataModel(id === void 0 ? this.id : id, text === void 0 ? this.text : text);
  };
  ItemDataModel.prototype.toString = function () {
    return 'ItemDataModel(id=' + Kotlin.toString(this.id) + (', text=' + Kotlin.toString(this.text)) + ')';
  };
  ItemDataModel.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.id) | 0;
    result = result * 31 + Kotlin.hashCode(this.text) | 0;
    return result;
  };
  ItemDataModel.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.id, other.id) && Kotlin.equals(this.text, other.text)))));
  };
  function ItemsDataModel(items) {
    this.items = items;
  }
  ItemsDataModel.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ItemsDataModel',
    interfaces: []
  };
  ItemsDataModel.prototype.component1 = function () {
    return this.items;
  };
  ItemsDataModel.prototype.copy_ij3vrf$ = function (items) {
    return new ItemsDataModel(items === void 0 ? this.items : items);
  };
  ItemsDataModel.prototype.toString = function () {
    return 'ItemsDataModel(items=' + Kotlin.toString(this.items) + ')';
  };
  ItemsDataModel.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.items) | 0;
    return result;
  };
  ItemsDataModel.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.items, other.items))));
  };
  function BaseMapperDMM() {
  }
  BaseMapperDMM.prototype.transformDMtoM_559obu$ = function (collection) {
    var tmp$;
    var list = ArrayList_init();
    var model;
    tmp$ = ensureNotNull(collection).iterator();
    while (tmp$.hasNext()) {
      var entity = tmp$.next();
      model = this.transformDMtoM_11rc$(entity);
      if (model != null) {
        list.add_11rb$(model);
      }
    }
    return list;
  };
  BaseMapperDMM.prototype.transformMtoDM_559p2j$ = function (collection) {
    var tmp$;
    var list = ArrayList_init();
    var model;
    tmp$ = ensureNotNull(collection).iterator();
    while (tmp$.hasNext()) {
      var entity = tmp$.next();
      model = this.transformMtoDM_11rb$(entity);
      if (model != null) {
        list.add_11rb$(model);
      }
    }
    return list;
  };
  BaseMapperDMM.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'BaseMapperDMM',
    interfaces: []
  };
  function ItemDMM() {
    BaseMapperDMM.call(this);
  }
  ItemDMM.prototype.transformDMtoM_11rc$ = function (dataModel) {
    if (dataModel != null) {
      return new ItemModel(dataModel.id, dataModel.text);
    }
    return null;
  };
  ItemDMM.prototype.transformMtoDM_11rb$ = function (model) {
    return null;
  };
  ItemDMM.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ItemDMM',
    interfaces: [BaseMapperDMM]
  };
  function ItemsDMM(videoItemDMM) {
    BaseMapperDMM.call(this);
    this.videoItemDMM_0 = videoItemDMM;
  }
  ItemsDMM.prototype.transformDMtoM_11rc$ = function (dataModel) {
    if (dataModel != null) {
      return new ItemsModel(this.videoItemDMM_0.transformDMtoM_559obu$(dataModel.items));
    }
    return null;
  };
  ItemsDMM.prototype.transformMtoDM_11rb$ = function (model) {
    return null;
  };
  ItemsDMM.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ItemsDMM',
    interfaces: [BaseMapperDMM]
  };
  function CustomItemService() {
    this.itemsDMM_0 = new ItemsDMM(new ItemDMM());
  }
  CustomItemService.prototype.getItems = function () {
    return this.createItems_0();
  };
  CustomItemService.prototype.createItems_0 = function () {
    var list = ArrayList_init();
    list.add_11rb$(new ItemDataModel(0, 'Hello'));
    list.add_11rb$(new ItemDataModel(1, 'World'));
    list.add_11rb$(new ItemDataModel(2, 'Kotlin MPP'));
    return this.itemsDMM_0.transformDMtoM_11rc$(new ItemsDataModel(list));
  };
  CustomItemService.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'CustomItemService',
    interfaces: [ItemRepository]
  };
  function PostExecutionThread() {
  }
  PostExecutionThread.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'PostExecutionThread',
    interfaces: []
  };
  function BaseViewModel() {
  }
  BaseViewModel.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'BaseViewModel',
    interfaces: []
  };
  function ItemModel(id, text) {
    this.id = id;
    this.text = text;
  }
  ItemModel.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ItemModel',
    interfaces: []
  };
  ItemModel.prototype.component1 = function () {
    return this.id;
  };
  ItemModel.prototype.component2 = function () {
    return this.text;
  };
  ItemModel.prototype.copy_19mbxw$ = function (id, text) {
    return new ItemModel(id === void 0 ? this.id : id, text === void 0 ? this.text : text);
  };
  ItemModel.prototype.toString = function () {
    return 'ItemModel(id=' + Kotlin.toString(this.id) + (', text=' + Kotlin.toString(this.text)) + ')';
  };
  ItemModel.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.id) | 0;
    result = result * 31 + Kotlin.hashCode(this.text) | 0;
    return result;
  };
  ItemModel.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.id, other.id) && Kotlin.equals(this.text, other.text)))));
  };
  function ItemsModel(items) {
    this.items = items;
  }
  ItemsModel.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ItemsModel',
    interfaces: []
  };
  ItemsModel.prototype.component1 = function () {
    return this.items;
  };
  ItemsModel.prototype.copy_89z5j3$ = function (items) {
    return new ItemsModel(items === void 0 ? this.items : items);
  };
  ItemsModel.prototype.toString = function () {
    return 'ItemsModel(items=' + Kotlin.toString(this.items) + ')';
  };
  ItemsModel.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.items) | 0;
    return result;
  };
  ItemsModel.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.items, other.items))));
  };
  function ItemRepository() {
  }
  ItemRepository.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'ItemRepository',
    interfaces: []
  };
  function ActionReceiver(f) {
    this.f_0 = f;
  }
  ActionReceiver.prototype.invoke_11rb$ = function (p1) {
    this.f_0(p1);
  };
  ActionReceiver.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ActionReceiver',
    interfaces: []
  };
  function ReceiveUseCase() {
  }
  ReceiveUseCase.prototype.execute_ffht3f$ = function (actionReceiver) {
    actionReceiver.invoke_11rb$(this.buildUseCaseReceiver());
  };
  ReceiveUseCase.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ReceiveUseCase',
    interfaces: []
  };
  function ReceiveUseCaseWithParameter() {
  }
  ReceiveUseCaseWithParameter.prototype.execute_dw60en$ = function (actionReceiver, params) {
    actionReceiver.invoke_11rb$(this.buildUseCaseReceiver_11rc$(params));
  };
  ReceiveUseCaseWithParameter.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ReceiveUseCaseWithParameter',
    interfaces: []
  };
  function GetMyItemsUseCase(repository) {
    ReceiveUseCase.call(this);
    this.repository_0 = repository;
  }
  GetMyItemsUseCase.prototype.buildUseCaseReceiver = function () {
    return this.repository_0.getItems();
  };
  GetMyItemsUseCase.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'GetMyItemsUseCase',
    interfaces: [ReceiveUseCase]
  };
  function BasePresenter() {
  }
  BasePresenter.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'BasePresenter',
    interfaces: []
  };
  function BaseView() {
  }
  BaseView.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'BaseView',
    interfaces: []
  };
  function ItemsContract() {
  }
  function ItemsContract$View() {
  }
  ItemsContract$View.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'View',
    interfaces: [BaseView]
  };
  function ItemsContract$Presenter() {
  }
  ItemsContract$Presenter.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Presenter',
    interfaces: [BasePresenter]
  };
  ItemsContract.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'ItemsContract',
    interfaces: []
  };
  function ItemsPresenter(getMyItemsUseCase, uiContext) {
    this.getMyItemsUseCase_0 = getMyItemsUseCase;
    this.uiContext_0 = uiContext;
    this.view_11xe7a$_0 = null;
  }
  Object.defineProperty(ItemsPresenter.prototype, 'view', {
    get: function () {
      return this.view_11xe7a$_0;
    },
    set: function (view) {
      this.view_11xe7a$_0 = view;
    }
  });
  function ItemsPresenter$showItems$lambda$lambda(this$ItemsPresenter) {
    return function (items) {
      var tmp$;
      if (items != null) {
        (tmp$ = this$ItemsPresenter.view) != null ? (tmp$.setItems_8yll1n$(items), Unit) : null;
      }
      return Unit;
    };
  }
  function ItemsPresenter$showItems$lambda(this$ItemsPresenter_0) {
    return function ($receiver, continuation_0, suspended) {
      var instance = new Coroutine$ItemsPresenter$showItems$lambda(this$ItemsPresenter_0, $receiver, this, continuation_0);
      if (suspended)
        return instance;
      else
        return instance.doResume(null);
    };
  }
  function Coroutine$ItemsPresenter$showItems$lambda(this$ItemsPresenter_0, $receiver, controller, continuation_0) {
    CoroutineImpl.call(this, continuation_0);
    this.$controller = controller;
    this.exceptionState_0 = 1;
    this.local$this$ItemsPresenter = this$ItemsPresenter_0;
  }
  Coroutine$ItemsPresenter$showItems$lambda.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: null,
    interfaces: [CoroutineImpl]
  };
  Coroutine$ItemsPresenter$showItems$lambda.prototype = Object.create(CoroutineImpl.prototype);
  Coroutine$ItemsPresenter$showItems$lambda.prototype.constructor = Coroutine$ItemsPresenter$showItems$lambda;
  Coroutine$ItemsPresenter$showItems$lambda.prototype.doResume = function () {
    do
      try {
        switch (this.state_0) {
          case 0:
            return this.local$this$ItemsPresenter.getMyItemsUseCase_0.execute_ffht3f$(new ActionReceiver(ItemsPresenter$showItems$lambda$lambda(this.local$this$ItemsPresenter))), Unit;
          case 1:
            throw this.exception_0;
          default:this.state_0 = 1;
            throw new Error('State Machine Unreachable execution');
        }
      }
       catch (e) {
        if (this.state_0 === 1) {
          this.exceptionState_0 = this.state_0;
          throw e;
        }
         else {
          this.state_0 = this.exceptionState_0;
          this.exception_0 = e;
        }
      }
     while (true);
  };
  ItemsPresenter.prototype.showItems = function () {
    launch(coroutines.GlobalScope, this.uiContext_0, void 0, ItemsPresenter$showItems$lambda(this));
  };
  ItemsPresenter.prototype.showError_0 = function (error) {
    var tmp$;
    (tmp$ = this.view) != null ? (tmp$.error_61zpoe$(error.toString()), Unit) : null;
  };
  ItemsPresenter.prototype.resume = function () {
    var tmp$;
    (tmp$ = this.view) != null ? (tmp$.setHeaderTitle(), Unit) : null;
    this.showItems();
  };
  ItemsPresenter.prototype.pause = function () {
  };
  ItemsPresenter.prototype.destroy = function () {
    this.view = null;
  };
  ItemsPresenter.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ItemsPresenter',
    interfaces: [ItemsContract$Presenter, BasePresenter]
  };
  function SettingsContract() {
  }
  function SettingsContract$View() {
  }
  SettingsContract$View.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'View',
    interfaces: [BaseView]
  };
  function SettingsContract$Presenter() {
  }
  SettingsContract$Presenter.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Presenter',
    interfaces: [BasePresenter]
  };
  SettingsContract.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'SettingsContract',
    interfaces: []
  };
  function SettingsPresenter() {
    this.view_64op9a$_0 = null;
  }
  Object.defineProperty(SettingsPresenter.prototype, 'view', {
    get: function () {
      return this.view_64op9a$_0;
    },
    set: function (view) {
      this.view_64op9a$_0 = view;
    }
  });
  SettingsPresenter.prototype.resume = function () {
    var tmp$;
    (tmp$ = this.view) != null ? (tmp$.setHeaderTitle(), Unit) : null;
  };
  SettingsPresenter.prototype.pause = function () {
  };
  SettingsPresenter.prototype.destroy = function () {
    this.view = null;
  };
  SettingsPresenter.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'SettingsPresenter',
    interfaces: [SettingsContract$Presenter, BasePresenter]
  };
  var package$de = _.de || (_.de = {});
  var package$flocksserver = package$de.flocksserver || (package$de.flocksserver = {});
  var package$mpp = package$flocksserver.mpp || (package$flocksserver.mpp = {});
  var package$data = package$mpp.data || (package$mpp.data = {});
  var package$model = package$data.model || (package$data.model = {});
  package$model.ItemDataModel = ItemDataModel;
  package$model.ItemsDataModel = ItemsDataModel;
  var package$mapper = package$model.mapper || (package$model.mapper = {});
  package$mapper.BaseMapperDMM = BaseMapperDMM;
  package$mapper.ItemDMM = ItemDMM;
  package$mapper.ItemsDMM = ItemsDMM;
  var package$service = package$data.service || (package$data.service = {});
  package$service.CustomItemService = CustomItemService;
  var package$domain = package$mpp.domain || (package$mpp.domain = {});
  package$domain.PostExecutionThread = PostExecutionThread;
  var package$model_0 = package$domain.model || (package$domain.model = {});
  package$model_0.BaseViewModel = BaseViewModel;
  package$model.ItemModel = ItemModel;
  package$model.ItemsModel = ItemsModel;
  var package$repository = package$domain.repository || (package$domain.repository = {});
  package$repository.ItemRepository = ItemRepository;
  var package$usecase = package$domain.usecase || (package$domain.usecase = {});
  var package$base = package$usecase.base || (package$usecase.base = {});
  package$base.ActionReceiver = ActionReceiver;
  package$base.ReceiveUseCase = ReceiveUseCase;
  package$base.ReceiveUseCaseWithParameter = ReceiveUseCaseWithParameter;
  var package$item = package$usecase.item || (package$usecase.item = {});
  package$item.GetMyItemsUseCase = GetMyItemsUseCase;
  var package$ui = package$mpp.ui || (package$mpp.ui = {});
  var package$base_0 = package$ui.base || (package$ui.base = {});
  package$base_0.BasePresenter = BasePresenter;
  package$base_0.BaseView = BaseView;
  ItemsContract.View = ItemsContract$View;
  ItemsContract.Presenter = ItemsContract$Presenter;
  var package$items = package$ui.items || (package$ui.items = {});
  package$items.ItemsContract = ItemsContract;
  package$items.ItemsPresenter = ItemsPresenter;
  SettingsContract.View = SettingsContract$View;
  SettingsContract.Presenter = SettingsContract$Presenter;
  var package$settings = package$ui.settings || (package$ui.settings = {});
  package$settings.SettingsContract = SettingsContract;
  package$settings.SettingsPresenter = SettingsPresenter;
  Kotlin.defineModule('shared-mp', _);
  return _;
}(module.exports, require('kotlin'), require('kotlinx-coroutines-core')));
