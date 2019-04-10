package com.example.mvvmstudy.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmstudy.model.SecondRepository

@Suppress("UNCHECKED_CAST")
class SecondViewModelFactory(private val repository: SecondRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass == SecondViewModel::class.java) {
            return SecondViewModel(repository) as T
        } else throw IllegalArgumentException("Unknown ViewModel class " + modelClass)
    }
}