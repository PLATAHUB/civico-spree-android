package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ProductResponse: Serializable {

    @SerializedName("products")
    var products:List<Product> = ArrayList()

    @SerializedName("count")
    var count: Int = 0

    @SerializedName("total_count")
    var totalCount: Int = 0

    @SerializedName("current_page")
    var currentPage: Int = 0

    @SerializedName("per_page")
    var perPage: Int = 0

    @SerializedName("pages")
    var pages: Int = 0

    override fun toString(): String {
        return "ProductResponse(products=$products, count=$count, totalCount=$totalCount, currentPage=$currentPage, perPage=$perPage, pages=$pages)"
    }

}