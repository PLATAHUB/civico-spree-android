package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Taxons : Serializable {

    @SerializedName("count")
    var count:Int = 0

    @SerializedName("total_count")
    var totalCount: Int = 0

    @SerializedName("current_page")
    var currentPage:Int = 0

    @SerializedName("per_page")
    var perPage:Int = 0

    @SerializedName("pages")
    var parentId:Int = 0

    @SerializedName("taxons")
    var taxons:List<Taxon> = ArrayList()

}