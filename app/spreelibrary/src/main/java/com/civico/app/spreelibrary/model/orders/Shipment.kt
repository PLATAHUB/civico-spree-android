package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Shipment: Serializable {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("tracking")
    var tracking: String = ""

    @SerializedName("number")
    var number: String = ""

    @SerializedName("cost")
    var cost: String = ""

    @SerializedName("shipped_at")
    var shippedAt: String = ""

    @SerializedName("state")
    var state: String = ""

    @SerializedName("shipping_rates")
    var shippingRates: List<ShippingRate> = ArrayList()

    @SerializedName("selected_shipping_rate")
    var selectedShippingRate: ShippingRate? = null

    @SerializedName("shipping_methods")
    var shippingMethods: List<ShippingMethod> = ArrayList()

    @SerializedName("manifest")
    var manifest: List<Any>? = null

    @SerializedName("adjustments")
    var adjustments: List<Any>? = null

    @SerializedName("order_id")
    var orderId: String = ""

    @SerializedName("stock_location_name")
    var stockLocationName: String = ""

}