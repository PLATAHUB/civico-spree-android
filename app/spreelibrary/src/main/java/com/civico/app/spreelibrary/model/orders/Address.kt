package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Address: Serializable {

    @SerializedName("id")
    val id: Int = 0

    @SerializedName("firstname")
    val firstName: String = ""

    @SerializedName("lastname")
    val lastName: String = ""

    @SerializedName("address1")
    val addressLine1: String = ""

    @SerializedName("address2")
    val addressLine2: String = ""

    @SerializedName("city")
    val city: String = ""

    @SerializedName("zipcode")
    val zipcode: String = ""

    @SerializedName("phone")
    val phone: String = ""

    @SerializedName("company")
    val company: String = ""

    @SerializedName("alternative_phone")
    val alternativePhone: String = ""

    @SerializedName("country_id")
    val countryId: Int = 0

    @SerializedName("state_id")
    val stateId: Int = 0

    @SerializedName("state_name")
    val stateName: String = ""

    @SerializedName("state_text")
    val stateText: String = ""

    @SerializedName("country")
    val country: Country? = null

    @SerializedName("state")
    val state: State? = null

}