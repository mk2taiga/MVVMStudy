package com.example.mvvmstudy

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MianViewModel: ViewModel() {

    var liveDataText: MutableLiveData<String> = MutableLiveData()

    fun fetchText(){
        liveDataText.value = MainRepository().fetchText()
    }

    var text: String? = null

    fun fetchText(listener: (String) -> Unit) {
        text = MainRepository().fetchText()
    }
}