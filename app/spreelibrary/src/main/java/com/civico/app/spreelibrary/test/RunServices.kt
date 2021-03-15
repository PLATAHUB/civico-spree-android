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
        private const val myToken =
            "f9f8f8d0d17a11e3a72310700edcd1822efdee40f4b1e1b76339a29d7bbad17f"

        @JvmStatic
        fun main(args: Array<String>) {
            //   getOnlyOneOrder()
            //approveOrder()
            // orderServices()
            //updateTracking()
            //shipmentIsReady()
            // orderIsShipped()
        }

     /*   private fun orderServices() {
            OrderServices.getSortedNewOrders(myToken, 1, object : DataCallback<OrderResponse> {
                override fun onResponse(code: Int, data: OrderResponse) {
                    println(data)
                }

                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }
            })
        }

        private fun orderIsShipped() {
            OrderServices.shipmentIsShipped(
                "H61018233093",
                myToken,
                object : DataCallback<Shipment> {
                    override fun onResponse(code: Int, data: Shipment) {
                        println(data)
                    }

                    override fun onError(code: Int, message: String) {
                        println(code)
                        println(message)
                    }
                })
        }

        private fun getOnlyOneOrder() {
            OrderServices.getOrder(
                "R394121672",
                "0ut3DJFN97T-uTeKWFjzCA1615581190211",
                object : DataCallback<Order> {
                    override fun onResponse(code: Int, data: Order) {
                        println(data)
                    }

                    override fun onError(code: Int, message: String) {
                        println(code)
                        println(message)
                    }
                })
        }

        private fun updateTracking() {
            OrderServices.updateShipmentTracking(
                "H61018233093",
                "12345679",
                myToken,
                dataCallback = object : DataCallback<Shipment> {
                    override fun onError(code: Int, message: String) {
                        println(code)
                        println(message)
                    }

                    override fun onResponse(code: Int, data: Shipment) {
                        println(data)
                    }
                })
        }

        private fun approveOrder() {
            OrderServices.approveOrder(
                "R021201443",
                myToken,
                dataCallback = object : DataCallback<Order> {
                    override fun onError(code: Int, message: String) {
                        println(code)
                        println(message)
                    }

                    override fun onResponse(code: Int, data: Order) {
                        println(data)
                    }
                })
        }

        private fun shipmentIsReady() {
            OrderServices.shipmentIsReady("H61018233093",
                myToken,
                dataCallback = object : DataCallback<Shipment> {
                    override fun onError(code: Int, message: String) {
                        println(code)
                        println(message)
                    }

                    override fun onResponse(code: Int, data: Shipment) {
                        println(data)
                    }
                })
        }
*/
    }
}

