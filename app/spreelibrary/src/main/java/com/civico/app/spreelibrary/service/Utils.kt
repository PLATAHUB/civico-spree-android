package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.model.ErrorResponse
import com.civico.app.spreelibrary.api.model.ErrorResponseDelivery
import com.google.gson.Gson
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */
object Utils {

    fun <T> executeCorrectResponse(response: Response<T>, dataCallback: DataCallback<T>){
        if (response.isSuccessful) {
            response.body()?.let { dataCallback.onResponse(response.code(), it) }
            return
        }
        val message: ErrorResponse = Gson().fromJson(response.errorBody()!!.charStream(), ErrorResponse::class.java)
        dataCallback.onError(response.code(), message.error)
    }

    fun <T> executeFailedResponse(t: Throwable, dataCallback: DataCallback<T>){
        dataCallback.onError(0, t.message.toString())
    }


    fun <T> executeCorrectResponseDelivery(response: Response<T>, dataCallback: DataCallback<T>){
        if (response.isSuccessful) {
            response.body()?.let { dataCallback.onResponse(response.code(), it) }
            return
        }
        val message: ErrorResponseDelivery = Gson().fromJson(response.errorBody()!!.charStream(), ErrorResponseDelivery::class.java)
        dataCallback.onError(response.code(), message.errors)
    }
}