package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ShippingRate: Serializable {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    var name: String = ""

    @SerializedName("cost")
    var cost: String = ""

    @SerializedName("selected")
    var selected: Boolean = false

    @SerializedName("shipping_method_id")
    var shippingMethodId: Int = 0

    @SerializedName("shipping_method_code")
    var shippingMethodCode: String = ""

    @SerializedName("display_cost")
    var displayCost: String = ""
}