package com.civico.app.spreelibrary.model.stock

import com.civico.app.spreelibrary.model.delivery.DeliveryInformation
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class StockItemConfiguration : Serializable {

    @SerializedName("stock_item")
    var stock_item: StockItem? = null
}