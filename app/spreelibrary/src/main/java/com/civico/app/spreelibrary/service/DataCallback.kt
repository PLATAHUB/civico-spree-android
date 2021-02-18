package com.civico.app.spreelibrary.service

/**
 *
 * @author caflorezvi
 */
interface DataCallback<T> {

    fun onResponse(code:Int, data:T)

    fun onError(code:Int, message:String)
}