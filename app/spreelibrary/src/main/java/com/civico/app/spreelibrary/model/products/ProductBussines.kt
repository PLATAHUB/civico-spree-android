package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ProductBussines : Serializable {

    @SerializedName("id")
    var id:Int ?= null

    @SerializedName("name")
    var name:String ?= null

    @SerializedName("available_on")
    var availableOn:String ?= null

    @SerializedName("discontinue_on")
    var discontinue_on:String ?= null

    @SerializedName("price")
    var price:String ?= null

    @SerializedName("description")
    var description:String ?= null

    @SerializedName("shipping_category_id")
    var shippingCategoryId:Int ?= null

    @SerializedName("vendor_id")
    var vendorId: String ?= null

    @SerializedName("compare_at_price")
    var compareAtPrice: String ?= null

    @SerializedName("conditions")
    var conditions: String ?= null

    @SerializedName("total_on_hand")
    var totalOnHand: Int ?= null

    @SerializedName("offer?")
    var offer: Boolean ?= null

    @SerializedName("percentage_discount")
    var percentageDiscount: Int ?= null

}