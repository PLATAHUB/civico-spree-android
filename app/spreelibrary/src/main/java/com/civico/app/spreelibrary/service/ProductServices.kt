package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.model.products.Image
import com.civico.app.spreelibrary.model.products.Product
import com.civico.app.spreelibrary.api.model.ProductResponse
import com.civico.app.spreelibrary.model.products.ProductConfiguration
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */

object ProductServices {

    fun getProducts(urlBase:String, userToken:String, page:Int=1, perPage:Int=20,  dataCallback: DataCallback<ProductResponse> ){
        ApiClient.getInstance(urlBase).apiService.getProducts(userToken, page, perPage).enqueue(object : Callback<ProductResponse>{
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getProductsForVendor(urlBase:String, userToken:String, idVendor:String, page:Int=1, perPage:Int=20,  dataCallback: DataCallback<ProductResponse> ){
        ApiClient.getInstance(urlBase).apiService.getProductsForVendor(userToken, idVendor, page, perPage).enqueue(object : Callback<ProductResponse>{
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

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

    fun getAllProducts(urlBase:String, userToken:String, dataCallback: DataCallback<ProductResponse>){

        ApiClient.getInstance(urlBase).apiService.getAllProducts(userToken).enqueue(object : Callback<ProductResponse> {
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })

    }

    fun addProduct(urlBase:String, userToken: String, product : ProductConfiguration, dataCallback: DataCallback<Product>){
        ApiClient.getInstance(urlBase).apiService.addProduct(userToken, product).enqueue(object : Callback<Product> {
            override fun onResponse(call: Call<Product>, response: Response<Product>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Product>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun updateProduct(urlBase:String, userToken: String, idProduct: Int, product : ProductConfiguration, dataCallback: DataCallback<Product>){
        ApiClient.getInstance(urlBase).apiService.updateProduct(userToken, idProduct, product).enqueue(object : Callback<Product> {
            override fun onResponse(call: Call<Product>, response: Response<Product>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Product>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }


    fun addProductImage(urlBase:String, userToken: String,  idProduct : Int, image : MultipartBody, dataCallback: DataCallback<Image>){
        ApiClient.getInstance(urlBase).apiService.addProductImage(userToken,  idProduct, image).enqueue(object : Callback<Image> {
            override fun onResponse(call: Call<Image>, response: Response<Image>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Image>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun updateProductImage(urlBase:String, userToken: String,  idProduct : Int, idImage : Int, image : MultipartBody, dataCallback: DataCallback<Image>){
        ApiClient.getInstance(urlBase).apiService.updateProductImage(userToken,  idProduct, idImage, image).enqueue(object : Callback<Image> {
            override fun onResponse(call: Call<Image>, response: Response<Image>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<Image>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun deleteProductImage(urlBase:String, userToken: String,  idProduct : Int, idImage : Int, dataCallback: DataCallbackDelete<Any?>){
        ApiClient.getInstance(urlBase).apiService.deletProductImage(userToken,  idProduct, idImage).enqueue(object : Callback<Any?> {
            override fun onResponse(call: Call<Any?>, response: Response<Any?>) {
                System.out.println("imprimiendo respuesta " + response.headers() + " imprimiendo status " + response.headers().get("Status"))
                var status : String = response.headers().get("Status").toString()
                Utils.executeCorrectResponseDelete(status, response, dataCallback)
            }

            override fun onFailure(call: Call<Any?>, t: Throwable) {
                Utils.executeFailedResponseDelete(t, dataCallback)
            }
        })
    }

    fun deleteProduct(urlBase:String, userToken: String,  idProduct : Int, dataCallback: DataCallbackDelete<Any?>){
        ApiClient.getInstance(urlBase).apiService.deletProduct(userToken,  idProduct,).enqueue(object : Callback<Any?> {
            override fun onResponse(call: Call<Any?>, response: Response<Any?>) {
                System.out.println("imprimiendo respuesta " + response.headers() + " imprimiendo status " + response.headers().get("Status"))
                var status : String = response.headers().get("Status").toString()
                Utils.executeCorrectResponseDelete(status, response, dataCallback)
            }

            override fun onFailure(call: Call<Any?>, t: Throwable) {
                Utils.executeFailedResponseDelete(t, dataCallback)
            }
        })
    }

}