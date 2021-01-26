package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Coupon : Serializable {

    @SerializedName("coupon_code")
    var couponCode:String? = null
}