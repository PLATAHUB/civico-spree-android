package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.api.model.CouponResponse
import com.civico.app.spreelibrary.api.model.LineItemWrapper
import com.civico.app.spreelibrary.api.model.OrderResponse
import com.civico.app.spreelibrary.api.model.OrderWrapper
import com.civico.app.spreelibrary.model.orders.Coupon
import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.model.orders.Shipment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */
object OrderServices {

    fun getOrders(urlBase:String, userToken: String, page: Int = 1, dataCallback: DataCallback<OrderResponse>) {
        ApiClient.getInstance(urlBase).apiService.getOrders(userToken, page).enqueue(object : Callback<OrderResponse> {
            override fun onResponse(call: Call<OrderResponse>, response: Response<OrderResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getOrder(urlBase:String, numberOrder: String, tokenOrder: String, dataCallback: DataCallback<Order>) {
        ApiClient.getInstance(urlBase).apiService.getOrder(numberOrder, tokenOrder).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getUserOrder(urlBase:String, userToken: String, numberOrder: String, dataCallback: DataCallback<Order>) {
        ApiClient.getInstance(urlBase).apiService.getUserOrder(numberOrder, userToken).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun createOrder(
        urlBase:String,
        userToken: String,
        orderWrapper: OrderWrapper,
        dataCallback: DataCallback<Order>
    ) {
        ApiClient.getInstance(urlBase).apiService.createOrder(userToken, orderWrapper).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun addToCart(
        urlBase:String,
        userToken: String,
        orderNumber: String,
        lineItemWrapper: LineItemWrapper,
        dataCallback: DataCallback<Order>
    ) {
        ApiClient.getInstance(urlBase).apiService.addToCart(orderNumber, userToken, lineItemWrapper)
            .enqueue(object : Callback<Order> {
                override fun onResponse(call: Call<Order>, response: Response<Order>) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<Order>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun editCartProduct(
        urlBase:String,
        userToken: String,
        orderNumber: String,
        idItemLine: Int,
        lineItemWrapper: LineItemWrapper,
        dataCallback: DataCallback<Order>
    ) {
        ApiClient.getInstance(urlBase).apiService.editCartProduct(orderNumber, idItemLine, userToken, lineItemWrapper)
            .enqueue(object : Callback<Order> {
                override fun onResponse(call: Call<Order>, response: Response<Order>) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<Order>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun removeCartProduct(
        urlBase:String,
        userToken: String,
        orderNumber: String,
        idItemLine: Int,
        dataCallback: DataCallback<Order>
    ) {
        ApiClient.getInstance(urlBase).apiService.removeCartProduct(orderNumber, idItemLine, userToken)
            .enqueue(object : Callback<Order> {
                override fun onResponse(call: Call<Order>, response: Response<Order>) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<Order>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun emptyCart(urlBase:String, userToken: String, orderNumber: String, dataCallback: DataCallback<Order>) {
        ApiClient.getInstance(urlBase).apiService.emptyCart(orderNumber, userToken).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun applyCouponCode(
        urlBase:String,
        userToken: String,
        orderNumber: String,
        coupon: Coupon,
        dataCallback: DataCallback<CouponResponse>
    ) {
        ApiClient.getInstance(urlBase).apiService.applyCouponCode(userToken, orderNumber, coupon)
            .enqueue(object : Callback<CouponResponse> {
                override fun onResponse(
                    call: Call<CouponResponse>,
                    response: Response<CouponResponse>
                ) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<CouponResponse>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun removeCouponCode(
        urlBase:String,
        userToken: String,
        orderNumber: String,
        coupon: Coupon,
        dataCallback: DataCallback<CouponResponse>
    ) {
        ApiClient.getInstance(urlBase).apiService.removeCouponCode(userToken, orderNumber, coupon)
            .enqueue(object : Callback<CouponResponse> {
                override fun onResponse(
                    call: Call<CouponResponse>,
                    response: Response<CouponResponse>
                ) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<CouponResponse>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun updateTracking(
        urlBase:String,
        userToken: String,
        orderWrapper: OrderWrapper,
        dataCallback: DataCallback<Order>
    ) {
        ApiClient.getInstance(urlBase).apiService.createOrder(userToken, orderWrapper).enqueue(object : Callback<Order> {
            override fun onResponse(call: Call<Order>, response: Response<Order>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Order>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun approveOrder(urlBase:String, orderNumber: String, userToken: String, dataCallback: DataCallback<Order>) {
        ApiClient.getInstance(urlBase).apiService.approveOrder(orderNumber = orderNumber, userToken = userToken)
            .enqueue(object : Callback<Order> {
                override fun onResponse(call: Call<Order>, response: Response<Order>) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<Order>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun shipmentIsReady(
        urlBase:String,
        id_Envio: String,
        userToken: String,
        dataCallback: DataCallback<Shipment>
    ) {
        ApiClient.getInstance(urlBase).apiService.shipmentIsReady(idEnvio = id_Envio, userToken = userToken)
            .enqueue(object : Callback<Shipment> {
                override fun onResponse(call: Call<Shipment>, response: Response<Shipment>) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<Shipment>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun shipmentIsShipped(
        urlBase:String,
        id_Envio: String,
        userToken: String,
        dataCallback: DataCallback<Shipment>
    ) {
        ApiClient.getInstance(urlBase).apiService.shipmentIsShipped(idEnvio = id_Envio, userToken = userToken)
            .enqueue(object : Callback<Shipment> {
                override fun onResponse(call: Call<Shipment>, response: Response<Shipment>) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<Shipment>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun getSortedNewOrders(
        urlBase:String,
        userToken: String,
        page: Int = 2,
        dataCallback: DataCallback<OrderResponse>
    ) {
        ApiClient.getInstance(urlBase).apiService.getSortedNewOrders(userToken, page)
            .enqueue(object : Callback<OrderResponse> {
                override fun onResponse(
                    call: Call<OrderResponse>,
                    response: Response<OrderResponse>
                ) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun getSortedCompleteOrders(
        urlBase:String,
        userToken: String,
        page: Int = 2,
        dataCallback: DataCallback<OrderResponse>
    ) {
        ApiClient.getInstance(urlBase).apiService.getSortedCompleteOrders(userToken, page)
            .enqueue(object : Callback<OrderResponse> {
                override fun onResponse(
                    call: Call<OrderResponse>,
                    response: Response<OrderResponse>
                ) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }

    fun updateShipmentTracking(
        urlBase:String,
        id_pedido: String,
        trackingNumber: String,
        userToken: String,
        dataCallback: DataCallback<Shipment>
    ) {
        ApiClient.getInstance(urlBase).apiService.updateShipmentTracking(
            idEnvio = id_pedido,
            idTracking = mapOf("shipment[tracking]" to trackingNumber),
            userToken = userToken
        )
            .enqueue(object : Callback<Shipment> {
                override fun onResponse(call: Call<Shipment>, response: Response<Shipment>) {
                    Utils.executeCorrectResponse(response, dataCallback)
                }

                override fun onFailure(call: Call<Shipment>, t: Throwable) {
                    Utils.executeFailedResponse(t, dataCallback)
                }
            })
    }
}