package com.civico.app.spreelibrary.api.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CouponResponse : Serializable {

    @SerializedName("success")
    var success:String? = null

    @SerializedName("error")
    var error:String? = null

    @SerializedName("successful")
    var successful:Boolean = false

    @SerializedName("status_code")
    var statusCode:String? = null

}