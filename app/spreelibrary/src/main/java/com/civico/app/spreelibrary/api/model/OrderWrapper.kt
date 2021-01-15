package com.civico.app.spreelibrary.api.model

import com.civico.app.spreelibrary.model.orders.Order
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class OrderWrapper: Serializable {

    @SerializedName("order")
    val order: Order? = null

}
