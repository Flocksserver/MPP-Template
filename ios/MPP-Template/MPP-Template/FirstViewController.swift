//
//  FirstViewController.swift
//  MPP-Template
//
//  Created by Marcel Kaufmann on 31.10.18.
//  Copyright © 2018 Marcel Kaufmann. All rights reserved.
//

import UIKit
import main

class FirstViewController: UIViewController, ItemsContractView {

    var presenter: ItemsPresenter!
    var itemsViewModel: BaseViewModel?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        self.presenter.view = self
        self.presenter.resume()
    }
    
    func setItems(model: ItemsModel) {
        // TODO specific view models and mapper in iOS
        view.subviews.forEach { $0.removeFromSuperview() }
        for (count, itemModel) in model.items.enumerated(){
            // TODO add correct styling and layout constraints in storyboard or programmatically
            let label = UILabel(frame: CGRect(x: 0, y: 0, width: self.view.frame.size.width, height: 21))
            label.center = CGPoint(x: 160, y: 80+(count*30))	
            label.textAlignment = .center
            label.font = itemModel.id != 2 ? label.font.withSize(25) : label.font.withSize(30)
            label.text = itemModel.text
            view.addSubview(label)
        }
    }
    
    func setHeaderTitle() {
        
    }

    
    func error(error: String) {
        
    }
    
    func getUIThread() -> UIContext {
        return UIThread()
    }

}

