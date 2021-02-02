package com.civico.app.spreelibrary.model.delivery

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DeliveryInformation  : Serializable {

    @SerializedName("has_delivery")
    var has_delivery: Boolean? = null

    @SerializedName("has_mensajeros_urbanos")
    var has_mensajeros_urbanos: Boolean? = null

    @SerializedName("enlistment_time")
    var enlistment_time: String? = null

    @SerializedName("_enlistment_time")
    var _enlistment_time: String? = null

    @SerializedName("schedules")
    var schedules: List<DeliverySchedules> = ArrayList()

    @SerializedName("delivery_companies")
    var delivery_companies: List<DeliveryCompanies> = ArrayList()

    @SerializedName("preparation_time")
    var preparation_time: Integer ?= null

}