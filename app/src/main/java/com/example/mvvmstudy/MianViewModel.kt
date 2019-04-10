package com.example.mvvmstudy

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MianViewModel: ViewModel() {

    var editText: MutableLiveData<String> = MutableLiveData()

    fun fetchText(){
        editText.value = MainRepository().fetchText()
    }
}