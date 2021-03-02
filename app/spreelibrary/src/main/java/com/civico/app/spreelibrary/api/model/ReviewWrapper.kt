package com.civico.app.spreelibrary.api.model

import com.civico.app.spreelibrary.model.products.Review
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ReviewWrapper : Serializable {

    @SerializedName("review")
    var review:Review? = null
}