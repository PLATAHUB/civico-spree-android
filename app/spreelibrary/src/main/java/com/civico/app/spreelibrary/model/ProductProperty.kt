package com.civico.app.spreelibrary.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ProductProperty: Serializable {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("product_id")
    var productId: Int = 0

    @SerializedName("property_id")
    var propertyId: Int = 0

    @SerializedName("value")
    var value: String = ""

    @SerializedName("property_name")
    var propertyName: String = ""


}