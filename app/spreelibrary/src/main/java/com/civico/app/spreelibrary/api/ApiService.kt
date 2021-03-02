package com.civico.app.spreelibrary.api

import com.civico.app.spreelibrary.api.model.*
import com.civico.app.spreelibrary.model.categories.Taxon
import com.civico.app.spreelibrary.model.delivery.DeliveryConfiguration
import com.civico.app.spreelibrary.model.delivery.DeliveryInformation
import com.civico.app.spreelibrary.model.orders.Coupon
import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.model.products.*
import okhttp3.MultipartBody
import com.civico.app.spreelibrary.model.orders.Shipment
import com.civico.app.spreelibrary.model.products.Image
import com.civico.app.spreelibrary.model.products.Product
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

/**
 *
 * @author caflorezvi
 */
interface ApiService {

    @GET("products")
    fun getAllProducts(@Header("X-Spree-Token") userToken: String):Call<ProductResponse>

    @GET("products")
    fun getProducts(@Header("X-Spree-Token") userToken: String, @Query("page") page: Int, @Query("per_page") perPage: Int):Call<ProductResponse>

    @GET("products")
    fun searchProducts(@Header("X-Spree-Token") userToken: String, @QueryMap(encoded = true) filters: Map<String, String>, @Query("page") page: Int):Call<ProductResponse>

    @GET("products/{productIdOrSlug}")
    fun getProduct(
        @Header("X-Spree-Token") userToken: String,
        @Path("productIdOrSlug") productIdOrSlug: String
    ): Call<Product>

    @GET("products/{productIdOrSlug}/images")
    fun getProductImages(
        @Header("X-Spree-Token") userToken: String,
        @Path("productIdOrSlug") productIdOrSlug: String
    ): Call<List<Image>>

    @GET("products/{productIdOrSlug}/images/{idImage}")
    fun getProductImage(
        @Header("X-Spree-Token") userToken: String,
        @Path("productIdOrSlug") productIdOrSlug: String,
        @Path("idImage") idImage: Int
    ): Call<Image>

    @PUT("products/{id_product}")
    fun updateProduct(@Header("X-Spree-Token") userToken: String,@Path("id_product") idProduct: Int, @Body product: ProductConfiguration): Call<Product>

    @POST("products")
    fun addProduct(@Header("X-Spree-Token") userToken: String, @Body product: ProductConfiguration): Call<Product>

    @POST("products/{id_product}/images")
    fun addProductImage(@Header("X-Spree-Token") userToken: String, @Path("id_product") idProduct: Int, @Body image: MultipartBody): Call<Image>

    @PUT("products/{id_product}/images/{id_image}")
    fun updateProductImage(@Header("X-Spree-Token") userToken: String,  @Path("id_product") idProduct: Int,  @Path("id_image") idImage: Int, @Body image: MultipartBody): Call<Image>

    @DELETE("products/{id_product}/images/{id_image}")
    fun deletProductImage(@Header("X-Spree-Token") userToken: String,  @Path("id_product") idProduct: Int,  @Path("id_image") idImage: Int): Call<Any?>

    @DELETE("products/{id_product}")
    fun deletProduct(@Header("X-Spree-Token") userToken: String,  @Path("id_product") idProduct: Int): Call<Any?>

    @POST("orders")
    fun createOrder(
        @Header("X-Spree-Token") userToken: String,
        @Body orderWrapper: OrderWrapper
    ): Call<Order>

    @GET("orders")
    fun getOrders(
        @Header("X-Spree-Token") userToken: String,
        @Query("page") page: Int
    ): Call<OrderResponse>

    @GET("orders/{orderNumber}")
    fun getOrder(
        @Path("orderNumber") orderNumber: String,
        @Query("order_token") orderToken: String
    ): Call<Order>

    @GET("orders/{orderNumber}")
    fun getUserOrder(
        @Path("orderNumber") orderNumber: String,
        @Header("X-Spree-Token") userToken: String
    ): Call<Order>

    @PUT("orders/{orderNumber}/empty")
    fun emptyCart(
        @Path("orderNumber") orderNumber: String,
        @Header("X-Spree-Token") userToken: String
    ): Call<Order>

    @PATCH("orders/{orderNumber}/line_items/{idItemLine}")
    fun editCartProduct(
        @Path("orderNumber") orderNumber: String,
        @Path("idItemLine") idItemLine: Int,
        @Header("X-Spree-Token") userToken: String,
        @Body lineItemWrapper: LineItemWrapper
    ): Call<Order>

    @DELETE("orders/{orderNumber}/line_items/{idItemLine}")
    fun removeCartProduct(
        @Path("orderNumber") orderNumber: String,
        @Path("idItemLine") idItemLine: Int,
        @Header("X-Spree-Token") userToken: String
    ): Call<Order>

    @POST("orders/{orderNumber}/line_items")
    fun addToCart(
        @Path("orderNumber") orderNumber: String,
        @Header("X-Spree-Token") userToken: String,
        @Body lineItemWrapper: LineItemWrapper
    ): Call<Order>

    @PUT("checkouts/{orderNumber}/next")
    fun moveToNextState(
        @Path("orderNumber") orderNumber: String,
        @Header("X-Spree-Token") userToken: String
    ): Call<Order>

    @PUT("checkouts/{orderNumber}")
    fun addCheckoutAddress(
        @Path("orderNumber") orderNumber: String,
        @Header("X-Spree-Token") userToken: String,
        @Body orderWrapper: OrderWrapper
    ): Call<Order>

    /*@POST("checkouts/{orderNumber}/line_items")
    fun addToCart(@Path("orderNumber") orderNumber: String, @Body lineItemWrapper: LineItemWrapper):Call<Order>

    @PATCH("checkouts/{orderNumber}/line_items/{idItemLine}")
    fun updateCartItems(@Path("orderNumber") orderNumber: String, @Path("idItemLine") idItemLine: String, @Body lineItemWrapper: LineItemWrapper):Call<Order>

    @DELETE("checkouts/{orderNumber}/line_items/{idItemLine}")
    fun deleteCartItems(@Path("orderNumber") orderNumber: String, @Path("idItemLine") idItemLine: String):Call<Order>*/

    @GET("taxonomies/{TaxonId}/taxons")
    fun getTaxonomies(
        @Header("X-Spree-Token") userToken: String,
        @Path("TaxonId") TaxonId: Int
    ): Call<TaxonResponse>

    @GET("taxonomies/{TaxonsId}/taxons/{TaxonId}")
    fun getTaxonomie(
        @Header("X-Spree-Token") userToken: String,
        @Path("TaxonsId") TaxonsId: Int,
        @Path("TaxonId") TaxonId: Int
    ): Call<Taxon>

    @GET("taxons")
    fun getTaxonsCategory(@Query("per_page") perPage: Int, @Query("page") page: Int, @Query("without_children") withoutChildren: Boolean, @Query("q[name_cont]") nameCont: String,  @Query("token") authToken: String):Call<Taxons>

    @PUT("orders/{orderNumber}/apply_coupon_code")
    fun applyCouponCode(
        @Header("X-Spree-Token") userToken: String,
        @Path("orderNumber") orderNumber: String,
        @Body coupon: Coupon
    ): Call<CouponResponse>

    @PUT("orders/{orderNumber}/remove_coupon_code")
    fun removeCouponCode(@Header("X-Spree-Token") userToken: String, @Path("orderNumber") orderNumber: String, @Body coupon: Coupon):Call<CouponResponse>

    @PUT("business/customers/{id-cliente}/update-delivery-information")
    fun addDelivery(@Header("city") city: String, @Path("id-cliente") idCliente: String,  @Query("auth_token") authToken: String, @Body deliveryInformation: DeliveryInformation):Call<DeliveryInformation>

    @GET("business/customers/{id-cliente}/delivery-information")
    fun getDelivery(@Header("city") city: String, @Path("id-cliente") idCliente: String,  @Query("auth_token") authToken: String):Call<DeliveryConfiguration>

    @PUT("orders/{id_pedido}/approve")
    fun approveOrder(
        @Path("id_pedido") orderNumber: String,
        @Header("X-Spree-Token") userToken: String
    ): Call<Order>

    @GET("orders")
    fun getSortedOrders(
        @Header("X-Spree-Token") userToken: String,
        @Query("page") page: Int,
        @QueryMap(encoded = true) isSorted: Map<String, String> = mapOf("q[s]" to "id desc"),
    ): Call<OrderResponse>

    @PUT("shipments/{id_envio}/ready")
    fun shipmentIsReady(
        @Path("id_envio") idEnvio: String,
        @Header("X-Spree-Token") userToken: String
    ): Call<Shipment>

    @PUT("shipments/{id_envio}")
    fun updateShipmentTracking(
        @Path("id_envio") idEnvio: String,
        @QueryMap(encoded = true) idTracking: Map<String, String>,
        @Header("X-Spree-Token") userToken: String
    ): Call<Shipment>

}