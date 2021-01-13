package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.model.Product
import com.civico.app.spreelibrary.model.ProductResponse
import retrofit2.Call;
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

public interface ApiService {

    @GET("products")
    fun getProducts():Call<ProductResponse>

    @GET("products")
    fun searchProducts(@QueryMap(encoded = true) query:Map<String, String> ):Call<ProductResponse>

    @GET("products/{id}")
    fun getProduct(@Path("id") productId:Int):Call<ProductResponse>
}