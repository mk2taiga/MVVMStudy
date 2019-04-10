package com.example.mvvmstudy.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmstudy.model.SecondRepository

class SecondViewModel(private val repository: SecondRepository): ViewModel() {
    var liveDataText: MutableLiveData<String> = MutableLiveData()

    fun fetchText() {
        liveDataText.value = repository.fetchText()
    }
}