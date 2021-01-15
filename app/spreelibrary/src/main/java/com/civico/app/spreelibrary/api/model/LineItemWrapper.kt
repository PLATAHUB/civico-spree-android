package com.civico.app.spreelibrary.api.model

import com.civico.app.spreelibrary.model.orders.LineItem
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class LineItemWrapper: Serializable {

    @SerializedName("line_item")
    val lineItem: LineItem? = null

}