package com.civico.app.spreelibrary.model.delivery

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DeliveryCompanies : Serializable {

    @SerializedName("company_name")
    var company_name: String? = null

    @SerializedName("delivery_cost")
    var delivery_cost: Double? = null

    @SerializedName("coverage_area")
    var coverage_area: String? = null

    @SerializedName("_coverage_area")
    var _coverage_area: String? = null

}