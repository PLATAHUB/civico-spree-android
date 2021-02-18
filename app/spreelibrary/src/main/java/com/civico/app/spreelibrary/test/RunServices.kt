package com.civico.app.spreelibrary.test

import com.civico.app.spreelibrary.api.model.CouponResponse
import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.api.model.OrderResponse
import com.civico.app.spreelibrary.api.model.ProductResponse
import com.civico.app.spreelibrary.model.orders.Coupon
import com.civico.app.spreelibrary.service.DataCallback
import com.civico.app.spreelibrary.service.OrderServices
import com.civico.app.spreelibrary.service.ProductServices

/**
 *
 * @author caflorezvi
 */
class RunServices {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            //val token = "7fb07faeb5fcf68152571afdba58284bdbf5fe30442fbcb55213949c155c9f11"
            val token = "6e7bfb9ab9140b85e28e6587da0859dd980ce34e52f06fef7af5553f18915770"
            //orderServices(token)

            val filters = mapOf("keywords" to "medias" )

            ProductServices.searchProducts(token, 1, filters, object: DataCallback<ProductResponse>{
                override fun onResponse(code:Int, data: ProductResponse) {
                    println(""+code+" "+data.products)
                }

                override fun onError(code: Int, message: String) {
                    println(message)
                }

            })

            /*val coupon = Coupon()
            coupon.couponCode = "CIVICO10"

            OrderServices.applyCouponCode(token, "R177804665", coupon, object: DataCallback<CouponResponse>{
                override fun onResponse(data: CouponResponse) {
                    print(data)
                }

                override fun onError(code: Int, message: String) {
                    print(message)
                }

            })*/

        }

        private fun orderServices(userToken:String){
            OrderServices.getOrder("R118199495", "XD8oN79QOa5pdo9QnYzDww1603224099434", object : DataCallback<Order>{
                override fun onResponse(code:Int, data: Order) {
                    println(data)
                }

                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }
            })

            OrderServices.getOrders(userToken = userToken, dataCallback =  object : DataCallback<OrderResponse>{
                override fun onResponse(code:Int, data: OrderResponse) {
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

