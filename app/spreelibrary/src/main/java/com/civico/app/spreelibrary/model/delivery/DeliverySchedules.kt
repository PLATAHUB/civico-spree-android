package com.civico.app.spreelibrary.model.delivery

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DeliverySchedules : Serializable {

    @SerializedName("start_day")
    var start_day: Int? = null

    @SerializedName("end_day")
    var end_day: Int? = null

    @SerializedName("start_hour")
    var start_hour: String = ""

    @SerializedName("end_hour")
    var end_hour: String = ""

    @SerializedName("open_24")
    var open_24: Boolean = false

}