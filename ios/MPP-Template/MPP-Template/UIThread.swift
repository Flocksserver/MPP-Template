//
//  UI.swift
//  MPP-Template
//
//  Created by Marcel Kaufmann on 31.10.18.
//  Copyright © 2018 Marcel Kaufmann. All rights reserved.
//

import Foundation
import UIKit
import TagListView_ObjC
import shared_mp
import MBProgressHUD

public class UIThread: Kotlinx_coroutines_core_nativeCoroutineDispatcher, UIContext {
    
    public var context: Kotlinx_coroutines_core_nativeCoroutineDispatcher = MainDispatcher()
    
}
