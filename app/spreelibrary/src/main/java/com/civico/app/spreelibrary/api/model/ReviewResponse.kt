package com.civico.app.spreelibrary.api.model

import com.civico.app.spreelibrary.model.products.Review
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ReviewResponse : Serializable {

    @SerializedName("reviews")
    var reviews:List<Review> = ArrayList()

    @SerializedName("count")
    var count: Int = 0

    @SerializedName("current_page")
    var currentPage: Int = 0

    @SerializedName("pages")
    var pages: Int = 0

    override fun toString(): String {
        return "ReviewResponse(reviews=$reviews, count=$count, currentPage=$currentPage, pages=$pages)"
    }

}