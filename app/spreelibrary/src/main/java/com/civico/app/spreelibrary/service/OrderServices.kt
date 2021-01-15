package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.api.model.ErrorResponse
import com.civico.app.spreelibrary.api.model.OrderResponse
import com.civico.app.spreelibrary.model.orders.Order
import com.google.gson.Gson
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 *
 * @author caflorezvi
 */
object OrderServices {

    fun getOrders(userToken: String, page: Int = 1, dataCallback: DataCallback<OrderResponse>){
        ApiClient.apiService.getOrders(userToken, page).enqueue(object : Callback<OrderResponse> {
            override fun onResponse(call: Call<OrderResponse>, response: Response<OrderResponse>) {
                if (response.isSuccessful) {
                    response.body()?.let { dataCallback.onResponse(it) }
                    return
                }
                val message: ErrorResponse = Gson().fromJson(response.errorBody()!!.charStream(), ErrorResponse::class.java)
                dataCallback.onError(response.code(), message.error)
            }

            override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
                dataCallback.onError(0, t.message.toString())
            }
        })
    }

    fun getOrder(numberOrder: String, tokenOrder: String, dataCallback: DataCallback<Order>){
        ApiClient.apiService.getOrder(numberOrder, tokenOrder).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                if (response.isSuccessful) {
                    response.body()?.let { dataCallback.onResponse(it) }
                    return
                }
                val message: ErrorResponse = Gson().fromJson(response.errorBody()!!.charStream(), ErrorResponse::class.java)
                dataCallback.onError(response.code(), message.error)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                dataCallback.onError(0, t.message.toString())
            }
        })
    }

}