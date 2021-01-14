package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.model.orders.OrderResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */
class OrderServices {

    fun getOrders(token:String, page:Int=1, dataCallback: DataCallback<OrderResponse>){

        ApiClient.getInstance(token).apiService.getOrders(page).enqueue(object : Callback<OrderResponse> {
            override fun onResponse(
                    call: Call<OrderResponse>,
                    response: Response<OrderResponse>
            ) {

                if(response.isSuccessful){
                    response.body()?.let { dataCallback.onResponse(it) }
                    return
                }
                dataCallback.onError(response.code(), response.message())

            }

            override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
                dataCallback.onError(0, t.message.toString())
            }

        })

    }

    fun getOrder(numberOrder:String, tokenOrder:String, token:String, dataCallback: DataCallback<Order>){

        ApiClient.getInstance(token).apiService.getOrder(numberOrder, tokenOrder).enqueue(object : Callback<Order> {
            override fun onResponse(
                    call: Call<Order>,
                    response: Response<Order>
            ) {
                if(response.isSuccessful){
                    response.body()?.let { dataCallback.onResponse(it) }
                    return
                }
                dataCallback.onError(response.code(), response.message())

            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                dataCallback.onError(0, t.message.toString())
            }

        })

    }

}