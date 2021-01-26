package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.api.model.CouponResponse
import com.civico.app.spreelibrary.api.model.LineItemWrapper
import com.civico.app.spreelibrary.api.model.OrderResponse
import com.civico.app.spreelibrary.api.model.OrderWrapper
import com.civico.app.spreelibrary.model.orders.Coupon
import com.civico.app.spreelibrary.model.orders.Order
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
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getOrder(numberOrder: String, tokenOrder: String, dataCallback: DataCallback<Order>){
        ApiClient.apiService.getOrder(numberOrder, tokenOrder).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getUserOrder(userToken: String, numberOrder: String, dataCallback: DataCallback<Order>){
        ApiClient.apiService.getUserOrder(numberOrder, userToken).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun createOrder(userToken: String, orderWrapper: OrderWrapper, dataCallback: DataCallback<Order>){
        ApiClient.apiService.createOrder(userToken, orderWrapper).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun addToCart(userToken: String, orderNumber: String, lineItemWrapper: LineItemWrapper, dataCallback: DataCallback<Order>){
        ApiClient.apiService.addToCart(orderNumber, userToken, lineItemWrapper).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun editCartProduct(userToken: String, orderNumber: String, idItemLine:Int, lineItemWrapper: LineItemWrapper, dataCallback: DataCallback<Order>){
        ApiClient.apiService.editCartProduct(orderNumber, idItemLine, userToken, lineItemWrapper).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun removeCartProduct(userToken: String, orderNumber: String, idItemLine:Int, dataCallback: DataCallback<Order>){
        ApiClient.apiService.removeCartProduct(orderNumber, idItemLine, userToken).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun emptyCart(userToken: String, orderNumber: String, dataCallback: DataCallback<Order>){
        ApiClient.apiService.emptyCart(orderNumber, userToken).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun applyCouponCode(userToken: String, orderNumber: String, coupon: Coupon, dataCallback: DataCallback<CouponResponse>){
        ApiClient.apiService.applyCouponCode(userToken, orderNumber, coupon).enqueue(object : Callback<CouponResponse> {
            override fun onResponse(call: Call<CouponResponse>, response: Response<CouponResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<CouponResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun removeCouponCode(userToken: String, orderNumber: String, coupon: Coupon, dataCallback: DataCallback<CouponResponse>){
        ApiClient.apiService.removeCouponCode(userToken, orderNumber, coupon).enqueue(object : Callback<CouponResponse> {
            override fun onResponse(call: Call<CouponResponse>, response: Response<CouponResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<CouponResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

}