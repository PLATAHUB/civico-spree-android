package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Filters: Serializable {

    @SerializedName("price_interval")
    var priceInterval:String? = null

    @SerializedName("prices")
    var prices: List<String>  = ArrayList()

    @SerializedName("categories")
    var categories: List<Category>  = ArrayList()

    override fun toString(): String {
        return "Filters(priceInterval=$priceInterval, prices=$prices, categories=$categories)"
    }

}