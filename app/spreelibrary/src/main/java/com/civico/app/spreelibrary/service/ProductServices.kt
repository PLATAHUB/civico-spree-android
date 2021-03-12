package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.model.products.Image
import com.civico.app.spreelibrary.model.products.Product
import com.civico.app.spreelibrary.api.model.ProductResponse
import com.civico.app.spreelibrary.api.model.ReviewResponse
import com.civico.app.spreelibrary.api.model.ReviewWrapper
import com.civico.app.spreelibrary.model.products.Review
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */
object ProductServices {

    /*fun getProducts(userToken:String, page:Int=1, dataCallback: DataCallback<ProductResponse> ){
        ApiClient.apiService.getProducts(userToken, page).enqueue(object : Callback<ProductResponse>{
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }*/

    /**
     * Filters: keywords, taxon, price, offer. mapOf(filter to "valor" )
     */
    fun searchProducts(urlBase:String, userToken:String, page:Int=1, filters:Map<String, String>, dataCallback: DataCallback<ProductResponse>){

        ApiClient.getInstance(urlBase).apiService.searchProducts(userToken, filters, page).enqueue(object : Callback<ProductResponse> {
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })

    }

    fun getProduct(urlBase:String, userToken:String, productIdOrSlug:String, dataCallback: DataCallback<Product> ){

        //productIdOrSlug = "camiseta-de-millos-2022"

        ApiClient.getInstance(urlBase).apiService.getProduct(userToken, productIdOrSlug).enqueue(object : Callback<Product> {
            override fun onResponse(call: Call<Product>, response: Response<Product>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Product>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getProductImages(urlBase:String, userToken:String, productIdOrSlug:String, dataCallback: DataCallback<List<Image>> ){
        ApiClient.getInstance(urlBase).apiService.getProductImages(userToken, productIdOrSlug).enqueue(object : Callback<List<Image>> {
            override fun onResponse(call: Call<List<Image>>, response: Response<List<Image>>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<List<Image>>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getProductImage(urlBase:String, userToken:String, productIdOrSlug:String, idImage:Int, dataCallback: DataCallback<Image> ){
        ApiClient.getInstance(urlBase).apiService.getProductImage(userToken, productIdOrSlug, idImage).enqueue(object : Callback<Image> {
            override fun onResponse(call: Call<Image>, response: Response<Image>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Image>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getProductReviews(urlBase:String, userToken:String, productIdOrSlug:String, page:Int, dataCallback: DataCallback<ReviewResponse> ){
        ApiClient.getInstance(urlBase).apiService.getProductReviews(userToken, productIdOrSlug, page).enqueue(object : Callback<ReviewResponse> {
            override fun onResponse(call: Call<ReviewResponse>, response: Response<ReviewResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<ReviewResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getReview(urlBase:String, userToken:String, productIdOrSlug:String, idReview:Int, dataCallback: DataCallback<Review> ){
        ApiClient.getInstance(urlBase).apiService.getReview(userToken, productIdOrSlug, idReview).enqueue(object : Callback<Review> {
            override fun onResponse(call: Call<Review>, response: Response<Review>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Review>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun createReview(urlBase:String, userToken:String, productIdOrSlug:String, review: ReviewWrapper, dataCallback: DataCallback<Review> ){
        ApiClient.getInstance(urlBase).apiService.createReview(userToken, productIdOrSlug, review).enqueue(object : Callback<Review> {
            override fun onResponse(call: Call<Review>, response: Response<Review>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Review>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

}