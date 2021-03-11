package com.civico.app.spreelibrary.test

import com.civico.app.spreelibrary.api.model.OrderResponse
import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.service.DataCallback
import com.civico.app.spreelibrary.service.OrderServices

/**
 *
 * @author caflorezvi
 */
class RunServices {

    companion object {
        private const val myToken = "28de02065c3be69e01ea4fcda8f789248cb04b1094bac66d5b9548dd0b5c2c90"

        @JvmStatic
        fun main(args: Array<String>) {
         //   getOnlyOneOrder()
            //  orderServices()
        }

        private fun orderServices() {
            val token = "7fb07faeb5fcf68152571afdba58284bdbf5fe30442fbcb55213949c155c9f11"
            val anotherToken = "XD8oN79QOa5pdo9QnYzDww1603224099434"


            //val token = "6e7bfb9ab9140b85e28e6587da0859dd980ce34e52f06fef7af5553f18915770"
            OrderServices.getSortedCompleteOrders(myToken, 1, object : DataCallback<OrderResponse> {
                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }

                override fun onResponse(code: Int, data: OrderResponse) {
                    println(data)
                }
            })
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
        }

     /*   private fun getOnlyOneOrder() {
            OrderServices.getOrder(
                "R021201443",
                "43TFd2bkZDzZMsa7CaQh5Q1614703800342",
                object : DataCallback<Order> {
                    override fun onResponse(data: Order) {
                        println(data)
                    }

                    override fun onError(code: Int, message: String) {
                        println(code)
                        println(message)
                    }
                })
        }

        private fun approveOrder() {
            OrderServices.approveOrder(
                "R021201443",
                myToken,
                dataCallback = object : DataCallback<Order> {
                    override fun onResponse(data: Order) {
                        println(data)
                    }

                    override fun onError(code: Int, message: String) {
                        println(code)
                        println(message)
                    }
                })
        }*/
    }
}

