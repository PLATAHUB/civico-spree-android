package com.civico.app.spreelibrary.service

/**
 *
 * @author caflorezvi
 */
interface DataCallback<T> {

    fun onResponse(data:T)

    fun onError(code:Int, message:String)
}