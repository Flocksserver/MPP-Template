//
//  MainDispatcher.swift
//  MPP-Template
//
//  Created by Marcel Kaufmann on 01.11.18.
//  Copyright © 2018 Marcel Kaufmann. All rights reserved.
//

import Foundation
import TagListView_ObjC
import main
import MBProgressHUD

public class MainDispatcher: Kotlinx_coroutines_core_nativeCoroutineDispatcher {
    override public func dispatch(context: KotlinCoroutineContext, block: Kotlinx_coroutines_core_nativeRunnable) {
        DispatchQueue.main.async {
            block.run()
        }
    }
}
