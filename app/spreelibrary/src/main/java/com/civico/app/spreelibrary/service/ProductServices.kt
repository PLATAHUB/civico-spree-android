package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.api.model.ErrorResponse
import com.civico.app.spreelibrary.model.products.Image
import com.civico.app.spreelibrary.model.products.Product
import com.civico.app.spreelibrary.api.model.ProductResponse
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */
object ProductServices {

    fun getProducts(userToken:String, page:Int=1, dataCallback: DataCallback<ProductResponse> ){
        ApiClient.apiService.getProducts(userToken, page).enqueue(object : Callback<ProductResponse>{
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                if(response.isSuccessful){
                    response.body()?.let { dataCallback.onResponse(it) }
                    return
                }
                val message: ErrorResponse = Gson().fromJson(response.errorBody()!!.charStream(), ErrorResponse::class.java)
                dataCallback.onError(response.code(), message.error)
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                dataCallback.onError(0, t.message.toString())
            }
        })
    }

    fun searchProducts(userToken:String, page:Int=1, query:Map<String, String>, dataCallback: DataCallback<ProductResponse>){

        //val query = mapOf("q[name_cont]" to "medias" )

        ApiClient.apiService.searchProducts(userToken, query, page).enqueue(object : Callback<ProductResponse> {
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                if(response.isSuccessful){
                    response.body()?.let { dataCallback.onResponse(it) }
                    return
                }
                val message: ErrorResponse = Gson().fromJson(response.errorBody()!!.charStream(), ErrorResponse::class.java)
                dataCallback.onError(response.code(), message.error)
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                dataCallback.onError(0, t.message.toString())
            }
        })

    }

    fun getProduct(userToken:String, productIdOrSlug:String, dataCallback: DataCallback<Product> ){

        //productIdOrSlug = "camiseta-de-millos-2022"

        ApiClient.apiService.getProduct(userToken, productIdOrSlug).enqueue(object : Callback<Product> {
            override fun onResponse(call: Call<Product>, response: Response<Product>) {
                if(response.isSuccessful){
                    response.body()?.let { dataCallback.onResponse(it) }
                    return
                }
                val message: ErrorResponse = Gson().fromJson(response.errorBody()!!.charStream(), ErrorResponse::class.java)
                dataCallback.onError(response.code(), message.error)
            }

            override fun onFailure(call: Call<Product>, t: Throwable) {
                dataCallback.onError(0, t.message.toString())
            }
        })
    }

    fun getProductImages(userToken:String, productIdOrSlug:String, dataCallback: DataCallback<List<Image>> ){
        ApiClient.apiService.getProductImages(userToken, productIdOrSlug).enqueue(object : Callback<List<Image>> {
            override fun onResponse(call: Call<List<Image>>, response: Response<List<Image>>) {
                if(response.isSuccessful){
                    response.body()?.let { dataCallback.onResponse(it) }
                    return
                }
                val message: ErrorResponse = Gson().fromJson(response.errorBody()!!.charStream(), ErrorResponse::class.java)
                dataCallback.onError(response.code(), message.error)
            }

            override fun onFailure(call: Call<List<Image>>, t: Throwable) {
                dataCallback.onError(0, t.message.toString())
            }
        })
    }

}