package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Adjustment: Serializable {

    @SerializedName("id")
    var id:Int? = null

    @SerializedName("source_type")
    var sourceType:String? = null

    @SerializedName("source_id")
    var sourceId:Int? = null

    @SerializedName("adjustable_type")
    var adjustableType:String? = null

    @SerializedName("adjustable_id")
    var adjustableId:Int? = null

    @SerializedName("amount")
    var amount:String? = null

    @SerializedName("label")
    var label:String? = null

    @SerializedName("mandatory")
    var mandatory:String? = null

    @SerializedName("eligible")
    var eligible:Boolean? = null

    @SerializedName("created_at")
    var createdAt:String? = null

    @SerializedName("updated_at")
    var updatedAt:String? = null

    @SerializedName("display_amount")
    var displayAmount:String? = null
}