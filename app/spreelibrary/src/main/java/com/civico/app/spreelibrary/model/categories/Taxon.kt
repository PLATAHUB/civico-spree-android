package com.civico.app.spreelibrary.model.categories

import com.civico.app.spreelibrary.model.products.Taxonomy
import com.google.gson.annotations.SerializedName
import java.io.Serializable




class Taxon: Serializable{

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    var name: String = ""

    @SerializedName("pretty_name")
    var attachmentContentType: String = ""

    @SerializedName("permalink")
    var permalink: String = ""

    @SerializedName("parent_id")
    var parent_id: Int = 0

    @SerializedName("taxonomy_id")
    var taxonomy_id: Int = 0

    @SerializedName("meta_title")
    var meta_title: String = ""

    @SerializedName("meta_description")
    var meta_description: String = ""

    @SerializedName("taxons")
    var classifications: List<TaxonMaster> = ArrayList()


}