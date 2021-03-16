package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.model.ErrorResponse
import com.google.gson.Gson
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */
object Utils {

    fun <T> executeCorrectResponse(response: Response<T>, dataCallback: DataCallback<T>){
        try {
            if (response.isSuccessful) {
                response.body()?.let { dataCallback.onResponse(response.code(), it) }
                return
            }
            val message: ErrorResponse = Gson().fromJson(response.errorBody()!!.charStream(), ErrorResponse::class.java)
            dataCallback.onError(response.code(), message.error)
        }catch (e:Exception){
            dataCallback.onError(500, "Error recuperando la información del servidor")
        }
    }

    fun <T> executeFailedResponse(t: Throwable, dataCallback: DataCallback<T>){
        try{
            dataCallback.onError(0, t.message.toString())
        }catch (e:Exception){
            dataCallback.onError(500, "Error recuperando la información del servidor")
        }
    }
}