import { Component } from '@angular/core';
import * as coroutines from '../../node_modules/kotlinx-coroutines-core/kotlinx-coroutines-core';
// TODO copy lib in web dir
import * as shared from './shared-mp';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})

// TODO interface here is useless
export class AppComponent {
  title = 'webapp';
  one = '';
  two = '';
  three = '';

  constructor() {
    const ui = coroutines.kotlinx.CoroutineDispatcher;
    // TODO why do I have to specify the package name?
    const repository: shared.de.flocksserver.mpp.domain.repository.ItemRepository = new shared.de.flocksserver.mpp.data.service.CustomItemService();
    const useCase = new shared.de.flocksserver.mpp.domain.usecase.item.GetMyItemsUseCase(repository);
    const presenter = new shared.de.flocksserver.mpp.ui.items.ItemsPresenter(useCase, ui);
    presenter.view = this;
    presenter.resume();
  }

  // TODO what the hell is that function name so ugly? I would bet this name will change on recompile...
  setItems_8yll1n$(model: shared.de.flocksserver.mpp.data.model.ItemsModel) {
    console.log(model.items.array_hd7ov6$_0);
    // TODO and so the arrayname?
    this.one = model.items.array_hd7ov6$_0[0].text;
    this.two = model.items.array_hd7ov6$_0[1].text;
    this.three = model.items.array_hd7ov6$_0[2].text;
  }

  setHeaderTitle() {
    console.log('should set title');
  }

}
