package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Payment: Serializable {

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("source_type")
    var sourceType:String = ""

    @SerializedName("source_id")
    var sourceId:String = ""

    @SerializedName("amount")
    var amount:String = ""

    @SerializedName("display_amount")
    var displayAmount:String = ""

    @SerializedName("payment_method_id")
    var paymentMethodId:Int = 0

    @SerializedName("state")
    var state:String = ""

    @SerializedName("avs_response")
    var avsResponse:String = ""

    @SerializedName("created_at")
    var createdAt:String = ""

    @SerializedName("updated_at")
    var updatedAt:String = ""

    @SerializedName("number")
    var number:String = ""

    @SerializedName("payment_method")
    var paymentMethod:PaymentMethod? = null

    @SerializedName("source")
    var source:String = ""

}