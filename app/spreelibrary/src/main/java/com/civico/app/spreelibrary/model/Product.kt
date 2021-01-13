package com.civico.app.spreelibrary.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Product: Serializable {

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("name")
    var name:String = ""

    @SerializedName("description")
    var description:String = ""

    @SerializedName("price")
    var price:String = ""

    @SerializedName("display_price")
    var displayPrice:String = ""

    @SerializedName("available_on")
    var availableOn:String = ""

    @SerializedName("slug")
    var slug:String = ""

    @SerializedName("meta_description")
    var metaDescription:String = ""

    @SerializedName("meta_keywords")
    var metaKeywords:String = ""

    @SerializedName("shipping_category_id")
    var shippingCategoryId:Int = 0

    @SerializedName("taxon_ids")
    var taxonIds: List<Int> = ArrayList()

    @SerializedName("total_on_hand")
    var totalOnHand: Int = 0

    @SerializedName("avg_rating")
    var avgRating: Int = 0

    @SerializedName("reviews_count")
    var reviewsCount: String = ""

    @SerializedName("master")
    var master: ProductMaster? = null

    @SerializedName("variants")
    var variants: List<ProductMaster> = ArrayList()

    @SerializedName("option_types")
    var optionTypes: List<OptionType> = ArrayList()

    @SerializedName("product_properties")
    var productProperties: List<ProductProperty> = ArrayList()

    @SerializedName("classifications")
    var classifications: List<Taxonomy> = ArrayList()

    @SerializedName("has_variants")
    var hasVariants:Boolean = false

    override fun toString(): String {
        return "Product(id=$id, name='$name', description='$description', price='$price', displayPrice='$displayPrice', availableOn='$availableOn', slug='$slug', metaDescription='$metaDescription', metaKeywords='$metaKeywords', shippingCategoryId=$shippingCategoryId, taxonIds=$taxonIds, totalOnHand=$totalOnHand, avgRating=$avgRating, reviewsCount='$reviewsCount', master=$master, variants=$variants, optionTypes=$optionTypes, productProperties=$productProperties, classifications=$classifications, hasVariants=$hasVariants)"
    }


}