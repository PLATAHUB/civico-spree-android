package com.civico.app.spreelibrary.api.model

import com.civico.app.spreelibrary.model.categories.Taxon
import com.civico.app.spreelibrary.model.products.Product
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class TaxonResponse: Serializable {

    @SerializedName("taxons")
    var taxons:List<Taxon> = ArrayList()

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
        return "TaxonResponse(taxons=$taxons, count=$count, totalCount=$totalCount, currentPage=$currentPage, perPage=$perPage, pages=$pages)"
    }

}