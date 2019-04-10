package com.example.mvvmstudy.model

interface SecondRepository {
    fun fetchText(): String

    class SecondRepositoryImpl : SecondRepository {
        override fun fetchText(): String {
            return "初期値！！"
        }
    }
}