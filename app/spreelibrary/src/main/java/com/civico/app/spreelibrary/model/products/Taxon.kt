package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Taxon: Serializable {

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("name")
    var name: String = ""

    @SerializedName("pretty_name")
    var prettyName:String = ""

    @SerializedName("permalink")
    var permalink:String = ""

    @SerializedName("parent_id")
    var parentId:Int = 0

    @SerializedName("taxonomy_id")
    var taxonomyId:Int = 0

    @SerializedName("meta_title")
    var metaTitle:String = ""

    @SerializedName("meta_description")
    var metaDescription:String = ""

    @SerializedName("taxons")
    var taxons:List<Taxon> = ArrayList()
}