package com.civico.app.spreelibrary.api

import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.model.orders.OrderResponse
import com.civico.app.spreelibrary.model.products.Product
import com.civico.app.spreelibrary.model.products.ProductResponse
import retrofit2.Call;
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

/**
 *
 * @author caflorezvi
 */
interface ApiService {

    @GET("products")
    fun getProducts(@Query("page") page:Int):Call<ProductResponse>

    @GET("products")
    fun searchProducts(@QueryMap(encoded = true) query:Map<String, String>, @Query("page") page:Int):Call<ProductResponse>

    @GET("products/{productIdOrSlug}")
    fun getProduct(@Path("productIdOrSlug") productIdOrSlug:String):Call<Product>

    @GET("products/{productIdOrSlug}/images")
    fun getProductImages(@Path("productIdOrSlug") productIdOrSlug:String):Call<Product>

    @GET("orders")
    fun getOrders(@Query("page") page:Int):Call<OrderResponse>

    @GET("orders/{orderNumber}")
    fun getOrder(@Path("orderNumber") orderNumber:String, @Query("order_token") orderToken:String ):Call<Order>
}