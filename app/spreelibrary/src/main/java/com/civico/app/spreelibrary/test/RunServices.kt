package com.civico.app.spreelibrary.test

import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.api.model.OrderResponse
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
            val token = "7fb07faeb5fcf68152571afdba58284bdbf5fe30442fbcb55213949c155c9f11"
            orderServices(token)

        }

        private fun productServices(token:String){

        }

        private fun orderServices(userToken:String){
            /*OrderServices.getOrder("R118199495", "XD8oN79QOa5pdo9QnYzDww1603224099434", object : DataCallback<Order>{
                override fun onResponse(data: Order) {
                    println(data)
                }

                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }
            })*/

            OrderServices.getOrders(userToken = "11", dataCallback =  object : DataCallback<OrderResponse>{
                override fun onResponse(data: OrderResponse) {
                    println(data)
                }

                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }
            })
        }
    }

}

