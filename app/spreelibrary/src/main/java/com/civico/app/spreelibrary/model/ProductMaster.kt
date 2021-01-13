package com.civico.app.spreelibrary.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ProductMaster: Serializable {

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("name")
    var name:String = ""

    @SerializedName("sku")
    var sku:String = ""

    @SerializedName("price")
    var price:String = ""

    @SerializedName("weight")
    var weight:String = ""

    @SerializedName("height")
    var height:String = ""

    @SerializedName("width")
    var width:String = ""

    @SerializedName("depth")
    var depth:String = ""

    @SerializedName("is_master")
    var master:Boolean = false

    @SerializedName("slug")
    var slug:String = ""

    @SerializedName("description")
    var description:String = ""

    @SerializedName("track_inventory")
    var trackInventory:Boolean = false

    @SerializedName("option_values")
    var optionValues:ArrayList<OptionValue> = ArrayList()

    @SerializedName("images")
    var images:ArrayList<Image> = ArrayList()

    @SerializedName("display_price")
    var displayPrice:String = ""

    @SerializedName("options_text")
    var optionsText:String = ""

    @SerializedName("in_stock")
    var inStock:Boolean = false

    @SerializedName("is_backorderable")
    var isBackorderable:Boolean = false

    @SerializedName("is_orderable")
    var isOrderable:Boolean = false

    @SerializedName("total_on_hand")
    var totalOnHand:Int = 0

    @SerializedName("is_destroyed")
    var isDestroyed:Boolean = false

}