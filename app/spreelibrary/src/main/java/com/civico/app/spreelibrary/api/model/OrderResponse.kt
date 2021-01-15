package com.civico.app.spreelibrary.api.model

import com.civico.app.spreelibrary.model.orders.Order
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class OrderResponse : Serializable {

    @SerializedName("orders")
    var orders:List<Order> = ArrayList()

    @SerializedName("count")
    var count: Int = 0

    @SerializedName("current_page")
    var currentPage: Int = 0

    @SerializedName("pages")
    var pages: Int = 0

    override fun toString(): String {
        return "OrderResponse(orders=$orders, count=$count, currentPage=$currentPage, pages=$pages)"
    }


}