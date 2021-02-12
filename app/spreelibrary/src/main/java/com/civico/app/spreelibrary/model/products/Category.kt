package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Category: Serializable {

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("name")
    var name:String? = null

    @SerializedName("children")
    var children: List<Category>  = ArrayList()

    override fun toString(): String {
        return "Category(id=$id, name=$name, children=$children)"
    }


}