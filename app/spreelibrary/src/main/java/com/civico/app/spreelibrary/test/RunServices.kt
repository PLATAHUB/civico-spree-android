package com.civico.app.spreelibrary.test

import com.civico.app.spreelibrary.api.model.OrderResponse
import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.model.orders.Shipment
import com.civico.app.spreelibrary.service.DataCallback
import com.civico.app.spreelibrary.service.OrderServices

/**
 *
 * @author caflorezvi
 */
class RunServices {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            orderServices()
        }

        private fun orderServices() {
            val token = "7fb07faeb5fcf68152571afdba58284bdbf5fe30442fbcb55213949c155c9f11"
            val anotherToken = "XD8oN79QOa5pdo9QnYzDww1603224099434"
          OrderServices.getOrder("R167785588", anotherToken, object : DataCallback<Order>{
                override fun onResponse(data: Order) {
                    println(data)
                }

                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }
            })
            //val token = "6e7bfb9ab9140b85e28e6587da0859dd980ce34e52f06fef7af5553f18915770"
           /* OrderServices.getOrders(token, 1, object : DataCallback<OrderResponse> {
                override fun onResponse(data: OrderResponse) {
                    println(data)
                }

                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }
            })*/

            /**/

            /*
             */
           /* OrderServices.updateShipmentTracking("H36947176950",
                 "12345679",
                 token,
                 dataCallback = object : DataCallback<Shipment> {
                     override fun onResponse(data: Shipment) {
                         println(data)
                         println(data)
                     }

                     override fun onError(code: Int, message: String) {
                         println(code)
                         println(message)
                     }
                 })*/

            /*OrderServices.approveOrder("R202648290", token,  dataCallback = object : DataCallback<Order> {
                override fun onResponse(data: Order) {
                    println(data)
                }

                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }
            })*/
        }
    }

}

