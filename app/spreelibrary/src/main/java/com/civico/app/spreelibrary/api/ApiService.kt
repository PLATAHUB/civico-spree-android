package com.civico.app.spreelibrary.api

import com.civico.app.spreelibrary.api.model.LineItemWrapper
import com.civico.app.spreelibrary.api.model.OrderResponse
import com.civico.app.spreelibrary.api.model.OrderWrapper
import com.civico.app.spreelibrary.api.model.ProductResponse
import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.model.products.Image
import com.civico.app.spreelibrary.model.products.Product
import retrofit2.Call
import retrofit2.http.*

/**
 *
 * @author caflorezvi
 */
interface ApiService {

    @GET("products")
    fun getProducts(@Header("X-Spree-Token") userToken: String, @Query("page") page: Int):Call<ProductResponse>

    @GET("products")
    fun searchProducts(@Header("X-Spree-Token") userToken: String, @QueryMap(encoded = true) query: Map<String, String>, @Query("page") page: Int):Call<ProductResponse>

    @GET("products/{productIdOrSlug}")
    fun getProduct(@Header("X-Spree-Token") userToken: String, @Path("productIdOrSlug") productIdOrSlug: String):Call<Product>

    @GET("products/{productIdOrSlug}/images")
    fun getProductImages(@Header("X-Spree-Token") userToken: String, @Path("productIdOrSlug") productIdOrSlug: String):Call<List<Image>>

    @POST("orders")
    fun createOrder(@Header("X-Spree-Token") userToken: String, @Body orderWrapper: OrderWrapper):Call<Order>

    @GET("orders")
    fun getOrders(@Header("X-Spree-Token") userToken: String, @Query("page") page: Int):Call<OrderResponse>

    @GET("orders/{orderNumber}")
    fun getOrder(@Path("orderNumber") orderNumber: String, @Query("order_token") orderToken: String):Call<Order>

    @PUT("orders/{orderNumber}/empty")
    fun emptyCart(@Path("orderNumber") orderNumber: String, @Header("X-Spree-Token") userToken: String): Call<Order>

    @PATCH("orders/{orderNumber}/line_items/{id}")
    fun editQuantity(@Path("orderNumber") orderNumber: String, @Path("id") id: Int, @Header("X-Spree-Token") userToken: String, @Body lineItemWrapper: LineItemWrapper): Call<Order>

    @DELETE("orders/{orderNumber}/line_items/{id}")
    fun removeProduct(@Path("orderNumber") orderNumber: String, @Path("id") id: Int, @Header("X-Spree-Token") userToken: String): Call<Order>

    @POST("orders/{orderNumber}/line_items")
    fun addToCart(@Path("orderNumber") orderNumber: String, @Header("X-Spree-Token") userToken: String, @Body lineItemWrapper: LineItemWrapper): Call<Order>

    @PUT("checkouts/{orderNumber}/next")
    fun moveToNextState(@Path("orderNumber") orderId: String, @Header("X-Spree-Token") userToken: String): Call<Order>

    @PUT("checkouts/{orderNumber}")
    fun moveToConfirmState(@Path("orderNumber") orderId: String, @Header("X-Spree-Token") userToken: String, @Body orderWrapper: OrderWrapper): Call<Order>

    /*@POST("checkouts/{orderNumber}/line_items")
    fun addToCart(@Path("orderNumber") orderNumber: String, @Body lineItemWrapper: LineItemWrapper):Call<Order>

    @PATCH("checkouts/{orderNumber}/line_items/{idItemLine}")
    fun updateCartItems(@Path("orderNumber") orderNumber: String, @Path("idItemLine") idItemLine: String, @Body lineItemWrapper: LineItemWrapper):Call<Order>

    @DELETE("checkouts/{orderNumber}/line_items/{idItemLine}")
    fun deleteCartItems(@Path("orderNumber") orderNumber: String, @Path("idItemLine") idItemLine: String):Call<Order>*/

}