package com.civico.app.spreelibrary.service

/**
 *
 * @author caflorezvi
 */
interface DataCallbackDelete<T> {

    fun onResponse()

    fun onError(code:Int, message:String)
}