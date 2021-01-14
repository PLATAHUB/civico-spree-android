package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class State: Serializable{

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    var name: String = ""

    @SerializedName("abbr")
    var abbr: String = ""

    @SerializedName("country_id")
    var countryId: Int = 0

}