package com.example.mvvmstudy.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmstudy.model.MainRepository

class MainViewModel : ViewModel() {

    var liveDataText: MutableLiveData<String> = MutableLiveData()

    fun fetchText() {
        liveDataText.value = MainRepository().fetchText()
    }

    fun fetchText(listener: (String) -> Unit) {
        listener(MainRepository().fetchText())
    }
}