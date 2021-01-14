package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ShippingCategory: Serializable {

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("name")
    var name:String = ""
}