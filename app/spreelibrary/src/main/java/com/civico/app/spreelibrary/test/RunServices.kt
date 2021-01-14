package com.civico.app.spreelibrary.test

import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.model.orders.OrderResponse
import com.civico.app.spreelibrary.model.products.Product
import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.model.products.ProductResponse
import com.civico.app.spreelibrary.service.DataCallback
import com.civico.app.spreelibrary.service.OrderServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */
class RunServices {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val token = "1"

            val orderServices = OrderServices()
            orderServices.getOrder("R118199495", "XD8oN79QOa5pdo9QnYzDww1603224099434", token, object : DataCallback<Order>{
                override fun onResponse(data: Order) {
                    println(data)
                }

                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }

            })

            orderServices.getOrders(token=token, dataCallback =  object : DataCallback<OrderResponse>{
                override fun onResponse(data: OrderResponse) {
                    println(data)
                }

                override fun onError(code: Int, message: String) {
                    println(code)
                    println(message)
                }

            })

        }

        private fun productServices(token: String){
            ApiClient.getInstance(token).apiService.getProducts(1).enqueue(object : Callback<ProductResponse>{
                override fun onResponse(
                        call: Call<ProductResponse>,
                        response: Response<ProductResponse>
                ) {
                    println(response.code())
                    println(response.body())
                }

                override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                    print(t.message)
                }

            })

            val query = mapOf("q[name_cont]" to "medias" )

            ApiClient.getInstance(token).apiService.searchProducts(query, 1).enqueue(object : Callback<ProductResponse>{
                override fun onResponse(
                        call: Call<ProductResponse>,
                        response: Response<ProductResponse>
                ) {
                    println(response.code())
                    println(response.body())
                }

                override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                    print(t.message)
                }

            })

            ApiClient.getInstance(token).apiService.getProduct("camiseta-de-millos-2022").enqueue(object : Callback<Product> {
                override fun onResponse(call: Call<Product>, response: Response<Product>) {

                    println(response.code())
                    println(response.message())
                    println(response.body())
                }

                override fun onFailure(call: Call<Product>, t: Throwable) {
                    print(t.message)
                }

            })
        }
    }


}

