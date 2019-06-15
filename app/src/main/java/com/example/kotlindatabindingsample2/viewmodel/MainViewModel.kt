package com.example.kotlindatabindingsample2.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class MainViewModel: BaseObservable() {

    var messageEditText: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.messageLength)
        }

    // @Bindableをつけることにより、監視用の定数BR.<name>が生成されます。
    // 呼び出し側へnotifyPropertyChanged(BR.<name>)を追加し、BR.<name>に対応するget()が呼ばれるようにします。
    @Bindable
    var messageLength: String = "0"
        get() = "${messageEditText.length}"
}