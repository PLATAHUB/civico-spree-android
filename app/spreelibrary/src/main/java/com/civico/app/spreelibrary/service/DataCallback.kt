package com.civico.app.spreelibrary.service

interface DataCallback<T> {

    fun onResponse(data:T)

    fun onError(code:Int, message:String)
}