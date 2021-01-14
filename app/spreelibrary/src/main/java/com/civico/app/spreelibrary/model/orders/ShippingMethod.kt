package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ShippingMethod: Serializable {

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("code")
    var code:String = ""

    @SerializedName("name")
    var name:String = ""

    @SerializedName("zones")
    var zones:List<Zone> = ArrayList()

    @SerializedName("shipping_categories")
    var shippingCategories:List<ShippingCategory> = ArrayList()

}