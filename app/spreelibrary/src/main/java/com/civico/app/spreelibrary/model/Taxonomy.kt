package com.civico.app.spreelibrary.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Taxonomy: Serializable {

    @SerializedName("taxon_id")
    var taxonId = 0

    @SerializedName("position")
    var position = 0

    @SerializedName("taxon")
    var taxon:Taxon? = null

}