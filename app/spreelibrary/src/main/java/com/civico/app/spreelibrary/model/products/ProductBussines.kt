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

    @SerializedName("taxon_ids")
    var taxonIds: List<Int> = ArrayList()

    /////

    @SerializedName("reservation_money_back ")
    var reservationMoneyBack: Boolean ?= null

    @SerializedName("reservation_time ")
    var reservationTime: Int ?= null

    @SerializedName("reservation_time_unit ")
    var reservationTimeUnit: String ?= null

    @SerializedName("reservation_reschedule ")
    var reservationReschedule: Boolean ?= null

    @SerializedName("reservation_cancellation_time ")
    var reservationCancellationTime: Int ?= null

    @SerializedName("reservation_cancellation_time_unit ")
    var reservationCancellationTimeUnit: String ?= null

    @SerializedName("warranty_money_back")
    var warrantyMoneyBack: Boolean ?= null

    @SerializedName("warranty_time")
    var warrantyTime: Int ?= null

    @SerializedName("warranty_time_unit")
    var warrantyTimeUnit: String ?= null


}