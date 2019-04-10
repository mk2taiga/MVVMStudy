package com.example.mvvmstudy

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var liveDataText: MutableLiveData<String> = MutableLiveData()

    fun fetchText() {
        liveDataText.value = MainRepository().fetchText()
    }

    fun fetchText(listener: (String) -> Unit) {
        listener(MainRepository().fetchText())
    }
}