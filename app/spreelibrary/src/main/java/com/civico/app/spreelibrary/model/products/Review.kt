package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Review() : Serializable{

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("rating")
    var rating:Int = 0

    @SerializedName("title")
    var title:String = ""

    @SerializedName("review")
    var review:String = ""

    @SerializedName("show_identifier")
    var showIdentifier:Boolean = false

    @SerializedName("name")
    var name:String = ""

    @SerializedName("email")
    var email:String = ""

    constructor(rating: Int, title: String, review: String, name: String, showIdentifier: Boolean) : this() {
        this.rating = rating
        this.title = title
        this.review = review
        this.showIdentifier = showIdentifier
        this.name = name
    }


    override fun toString(): String {
        return "Review(id=$id, rating=$rating, title='$title', review='$review', showIdentifier=$showIdentifier, name='$name', email='$email')"
    }

}