package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Zone: Serializable {

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("name")
    var name:String = ""

    @SerializedName("description")
    var description:String = ""
}