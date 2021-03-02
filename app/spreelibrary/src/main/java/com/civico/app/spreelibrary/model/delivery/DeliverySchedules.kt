package com.civico.app.spreelibrary.model.delivery

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DeliverySchedules : Serializable {

    @SerializedName("start_day")
    var start_day: Int? = null

    @SerializedName("end_day")
    var end_day: Int? = null

    @SerializedName("start_hour")
    var start_hour: String? = null

    @SerializedName("end_hour")
    var end_hour: String? = null

    @SerializedName("open_24")
    var open_24: Boolean? = false

    @SerializedName("scheduleDelete")
    var scheduleDelete: Boolean? = false

    @SerializedName("scheduleDesde")
    var scheduleDesde: String? = ""

    @SerializedName("scheduleDesdePosition")
    var scheduleDesdePosition: Int = 0

    @SerializedName("scheduleHasta")
    var scheduleHasta: String? = ""

    @SerializedName("scheduleHastaPosition")
    var scheduleHastaPosition: Int = 0

    @SerializedName("scheduleHourFromPosition")
    var scheduleHourFromPosition: Int = 0

    @SerializedName("scheduleHourUntilPosition")
    var scheduleHourUntilPosition: Int = 0

}