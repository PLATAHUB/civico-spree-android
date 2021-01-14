package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ProductMaster: Serializable {

    @SerializedName("product_id")
    var productId:Int? = null

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
    var optionValues:List<OptionValue> = ArrayList()

    @SerializedName("images")
    var images:List<Image> = ArrayList()

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

    override fun toString(): String {
        return "ProductMaster(productId=$productId, id=$id, name='$name', sku='$sku', price='$price', weight='$weight', height='$height', width='$width', depth='$depth', master=$master, slug='$slug', description='$description', trackInventory=$trackInventory, optionValues=$optionValues, images=$images, displayPrice='$displayPrice', optionsText='$optionsText', inStock=$inStock, isBackorderable=$isBackorderable, isOrderable=$isOrderable, totalOnHand=$totalOnHand, isDestroyed=$isDestroyed)"
    }


}