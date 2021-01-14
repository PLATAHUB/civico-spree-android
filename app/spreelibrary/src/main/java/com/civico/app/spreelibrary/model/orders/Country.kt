package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Country: Serializable {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("iso_name")
    var isoName: String = ""

    @SerializedName("iso")
    var iso: String = ""

    @SerializedName("iso3")
    var iso3: String = ""

    @SerializedName("name")
    var name: String = ""

    @SerializedName("numcode")
    var numcode: Int = 0

}