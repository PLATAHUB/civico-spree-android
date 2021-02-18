package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Address: Serializable {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("firstname")
    var firstName: String = ""

    @SerializedName("lastname")
    var lastName: String = ""

    @SerializedName("address1")
    var addressLine1: String = ""

    @SerializedName("address2")
    var addressLine2: String = ""

    @SerializedName("city")
    var city: String = ""

    @SerializedName("zipcode")
    var zipcode: String = ""

    @SerializedName("phone")
    var phone: String = ""

    @SerializedName("company")
    var company: String = ""

    @SerializedName("alternative_phone")
    var alternativePhone: String = ""

    @SerializedName("country_id")
    var countryId: Int = 0

    @SerializedName("state_id")
    var stateId: Int = 0

    @SerializedName("state_name")
    var stateName: String = ""

    @SerializedName("state_text")
    var stateText: String = ""

    @SerializedName("country")
    var country: Country? = null

    @SerializedName("state")
    var state: State? = null

}