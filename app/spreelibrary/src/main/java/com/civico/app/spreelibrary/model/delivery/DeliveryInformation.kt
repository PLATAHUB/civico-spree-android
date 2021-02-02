package com.civico.app.spreelibrary.model.delivery

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DeliveryInformation  : Serializable {

    @SerializedName("has_delivery")
    var has_delivery: Boolean = false

    @SerializedName("has_mensajeros_urbanos")
    var has_mensajeros_urbanos: Boolean = false

    @SerializedName("enlistment_time")
    var enlistment_time: String = ""

    @SerializedName("schedules")
    var schedules: List<DeliverySchedules> = ArrayList()

    @SerializedName("delivery_companies")
    var delivery_companies: List<DeliveryCompanies> = ArrayList()

    @SerializedName("preparation_time")
    var preparation_time: Integer ?= null

}