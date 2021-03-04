package com.civico.app.spreelibrary.model.stock

import com.civico.app.spreelibrary.model.categories.Taxon
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class StockItem : Serializable {

    @SerializedName("count_on_hand")
    var countOnHand: Int ?= 0

    @SerializedName("force")
    var force: Boolean ?= null

    @SerializedName("backorderable")
    var backorderable: Boolean ?= null

}