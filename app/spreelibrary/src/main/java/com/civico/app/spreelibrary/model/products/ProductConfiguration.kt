package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ProductConfiguration: Serializable {

    @SerializedName("product")
    var product:ProductBussines ?= null

}