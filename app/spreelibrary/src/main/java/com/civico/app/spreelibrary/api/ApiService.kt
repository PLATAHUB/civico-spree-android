package com.civico.app.spreelibrary.api

import com.civico.app.spreelibrary.api.model.*
import com.civico.app.spreelibrary.model.categories.Taxon
import com.civico.app.spreelibrary.model.orders.Coupon
import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.model.products.Image
import com.civico.app.spreelibrary.model.products.Product
import com.civico.app.spreelibrary.model.products.Review
import retrofit2.Call
import retrofit2.http.*

/**
 *
 * @author caflorezvi
 */
interface ApiService {

    /*@GET("products")
    fun getProducts(@Header("X-Spree-Token") userToken: String, @Query("page") page: Int):Call<ProductResponse>*/

    @GET("products")
    fun searchProducts(@Header("X-Spree-Token") userToken: String, @QueryMap(encoded = true) filters: Map<String, String>, @Query("page") page: Int):Call<ProductResponse>

    @GET("products/{productIdOrSlug}")
    fun getProduct(@Header("X-Spree-Token") userToken: String, @Path("productIdOrSlug") productIdOrSlug: String):Call<Product>

    @GET("products/{productIdOrSlug}/images")
    fun getProductImages(@Header("X-Spree-Token") userToken: String, @Path("productIdOrSlug") productIdOrSlug: String):Call<List<Image>>

    @GET("products/{productIdOrSlug}/images/{idImage}")
    fun getProductImage(@Header("X-Spree-Token") userToken: String, @Path("productIdOrSlug") productIdOrSlug: String, @Path("idImage") idImage: Int):Call<Image>

    @GET("products/{productIdOrSlug}/reviews")
    fun getProductReviews(@Header("X-Spree-Token") userToken: String, @Path("productIdOrSlug") productIdOrSlug: String, @Query("page") page: Int):Call<ReviewResponse>

    @GET("products/{productIdOrSlug}/reviews/{idReview}")
    fun getReview(@Header("X-Spree-Token") userToken: String, @Path("productIdOrSlug") productIdOrSlug: String, @Path("idReview") idReview: Int):Call<Review>

    @POST("products/{productIdOrSlug}/reviews")
    fun createReview(@Header("X-Spree-Token") userToken: String, @Path("productIdOrSlug") productIdOrSlug: String, @Body review: ReviewWrapper):Call<Review>

    @POST("orders")
    fun createOrder(@Header("X-Spree-Token") userToken: String, @Body orderWrapper: OrderWrapper):Call<Order>

    @GET("orders")
    fun getOrders(@Header("X-Spree-Token") userToken: String, @Query("page") page: Int):Call<OrderResponse>

    @GET("orders/{orderNumber}")
    fun getOrder(@Path("orderNumber") orderNumber: String, @Query("order_token") orderToken: String):Call<Order>

    @GET("orders/{orderNumber}")
    fun getUserOrder(@Path("orderNumber") orderNumber: String, @Header("X-Spree-Token") userToken: String):Call<Order>

    @PUT("orders/{orderNumber}/empty")
    fun emptyCart(@Path("orderNumber") orderNumber: String, @Header("X-Spree-Token") userToken: String): Call<Order>

    @PATCH("orders/{orderNumber}/line_items/{idItemLine}")
    fun editCartProduct(@Path("orderNumber") orderNumber: String, @Path("idItemLine") idItemLine: Int, @Header("X-Spree-Token") userToken: String, @Body lineItemWrapper: LineItemWrapper): Call<Order>

    @DELETE("orders/{orderNumber}/line_items/{idItemLine}")
    fun removeCartProduct(@Path("orderNumber") orderNumber: String, @Path("idItemLine") idItemLine: Int, @Header("X-Spree-Token") userToken: String): Call<Order>

    @POST("orders/{orderNumber}/line_items")
    fun addToCart(@Path("orderNumber") orderNumber: String, @Header("X-Spree-Token") userToken: String, @Body lineItemWrapper: LineItemWrapper): Call<Order>

    @PUT("checkouts/{orderNumber}/next")
    fun moveToNextState(@Path("orderNumber") orderNumber: String, @Header("X-Spree-Token") userToken: String): Call<Order>

    @PUT("checkouts/{orderNumber}")
    fun addCheckoutAddress(@Path("orderNumber") orderNumber: String, @Header("X-Spree-Token") userToken: String, @Body orderWrapper: OrderWrapper): Call<Order>

    /*@POST("checkouts/{orderNumber}/line_items")
    fun addToCart(@Path("orderNumber") orderNumber: String, @Body lineItemWrapper: LineItemWrapper):Call<Order>

    @PATCH("checkouts/{orderNumber}/line_items/{idItemLine}")
    fun updateCartItems(@Path("orderNumber") orderNumber: String, @Path("idItemLine") idItemLine: String, @Body lineItemWrapper: LineItemWrapper):Call<Order>

    @DELETE("checkouts/{orderNumber}/line_items/{idItemLine}")
    fun deleteCartItems(@Path("orderNumber") orderNumber: String, @Path("idItemLine") idItemLine: String):Call<Order>*/

    @GET("taxonomies/{TaxonId}/taxons")
    fun getTaxonomies(@Header("X-Spree-Token") userToken: String, @Path("TaxonId") TaxonId: Int):Call<TaxonResponse>

    @GET("taxonomies/{TaxonsId}/taxons/{TaxonId}")
    fun getTaxonomie(@Header("X-Spree-Token") userToken: String, @Path("TaxonsId") TaxonsId: Int, @Path("TaxonId") TaxonId: Int):Call<Taxon>

    @PUT("orders/{orderNumber}/apply_coupon_code")
    fun applyCouponCode(@Header("X-Spree-Token") userToken: String, @Path("orderNumber") orderNumber: String, @Body coupon: Coupon):Call<CouponResponse>

    @PUT("orders/{orderNumber}/remove_coupon_code")
    fun removeCouponCode(@Header("X-Spree-Token") userToken: String, @Path("orderNumber") orderNumber: String, @Body coupon: Coupon):Call<CouponResponse>
}