package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.model.products.Image
import com.civico.app.spreelibrary.model.products.Product
import com.civico.app.spreelibrary.api.model.ProductResponse
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
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun searchProducts(userToken:String, page:Int=1, query:Map<String, String>, dataCallback: DataCallback<ProductResponse>){

        //val query = mapOf("q[name_cont]" to "medias" )

        ApiClient.apiService.searchProducts(userToken, query, page).enqueue(object : Callback<ProductResponse> {
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })

    }

    fun getProduct(userToken:String, productIdOrSlug:String, dataCallback: DataCallback<Product> ){

        //productIdOrSlug = "camiseta-de-millos-2022"

        ApiClient.apiService.getProduct(userToken, productIdOrSlug).enqueue(object : Callback<Product> {
            override fun onResponse(call: Call<Product>, response: Response<Product>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Product>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getProductImages(userToken:String, productIdOrSlug:String, dataCallback: DataCallback<List<Image>> ){
        ApiClient.apiService.getProductImages(userToken, productIdOrSlug).enqueue(object : Callback<List<Image>> {
            override fun onResponse(call: Call<List<Image>>, response: Response<List<Image>>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<List<Image>>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getProductImage(userToken:String, productIdOrSlug:String, idImage:Int, dataCallback: DataCallback<Image> ){
        ApiClient.apiService.getProductImage(userToken, productIdOrSlug, idImage).enqueue(object : Callback<Image> {
            override fun onResponse(call: Call<Image>, response: Response<Image>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Image>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

}