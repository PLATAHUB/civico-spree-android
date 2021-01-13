package com.civico.app.spreelibrary.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class OptionType : Serializable {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    var name: String = ""

    @SerializedName("presentation")
    var presentation: String = ""

    @SerializedName("position")
    var position: Int = 0
}