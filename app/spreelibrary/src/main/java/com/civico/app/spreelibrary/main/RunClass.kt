package com.civico.app.spreelibrary.main

import com.civico.app.spreelibrary.model.ProductResponse
import com.civico.app.spreelibrary.service.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RunClass {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val token = "7fb07faeb5fcf68152571afdba58284bdbf5fe30442fbcb55213949c155c9f11"
            val client:ApiClient = ApiClient(token)

            /*client.apiService.getProducts().enqueue(object : Callback<ProductResponse>{
                override fun onResponse(
                    call: Call<ProductResponse>,
                    response: Response<ProductResponse>
                ) {

                    if(!response.isSuccessful){
                        print(response.code())
                        return
                    }

                    print(response.body())
                }

                override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                    print(t.message)
                }

            })*/

            val query = mapOf("q[name_cont]" to "millos" )

            client.apiService.searchProducts(query).enqueue(object : Callback<ProductResponse>{
                override fun onResponse(
                    call: Call<ProductResponse>,
                    response: Response<ProductResponse>
                ) {

                    if(!response.isSuccessful){
                        print(response.code())
                        return
                    }

                    print(response.body())
                }

                override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                    print(t.message)
                }

            })

        }
    }

}

