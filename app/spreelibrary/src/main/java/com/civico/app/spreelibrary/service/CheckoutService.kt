package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.api.model.OrderWrapper
import com.civico.app.spreelibrary.model.orders.Order
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */
object CheckoutService {

    fun moveToNextState(userToken: String, orderNumber: String, dataCallback: DataCallback<Order>){
        ApiClient.apiService.moveToNextState(orderNumber, userToken).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun moveToConfirmState(userToken: String, orderNumber: String, order: Order, dataCallback: DataCallback<Order>){
        val orderWrapper = OrderWrapper()
        orderWrapper.order = order
        ApiClient.apiService.moveToConfirmState(orderNumber, userToken, orderWrapper).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }
}