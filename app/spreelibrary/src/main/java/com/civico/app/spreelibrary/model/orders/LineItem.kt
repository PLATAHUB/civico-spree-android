package com.civico.app.spreelibrary.model.orders

import com.civico.app.spreelibrary.model.products.ProductMaster
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class LineItem: Serializable {

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("quantity")
    var quantity: Int? = null

    @SerializedName("price")
    var price: String? = null

    @SerializedName("variant_id")
    var variantId: Int? = null

    @SerializedName("variant")
    var variant: ProductMaster? = null

    @SerializedName("adjustments")
    var adjustments: List<String> = ArrayList()

    @SerializedName("single_display_amount")
    var singleDisplayAmount: String? = null

    @SerializedName("display_amount")
    var displayAmount: String? = null

    @SerializedName("total")
    var total: String? = null

    override fun toString(): String {
        return "LineItem(id=$id, quantity=$quantity, price='$price', variantId=$variantId, variant=$variant, adjustments=$adjustments, singleDisplayAmount='$singleDisplayAmount', displayAmount='$displayAmount', total='$total')"
    }

}