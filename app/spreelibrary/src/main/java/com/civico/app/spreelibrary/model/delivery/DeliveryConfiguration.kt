package com.civico.app.spreelibrary.model.delivery

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DeliveryConfiguration : Serializable {

    @SerializedName("delivery_configuration")
    var delivery_configuration: DeliveryInformation? = null

}