package com.civico.app.spreelibrary.model.products

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Image: Serializable{

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("position")
    var position: Int = 0

    @SerializedName("attachment_content_type")
    var attachmentContentType: String = ""

    @SerializedName("attachment_file_name")
    var attachmentFileName: String = ""

    @SerializedName("type")
    var type: String = ""

    @SerializedName("attachment_updated_at")
    var attachmentUpdatedAt: String = ""

    @SerializedName("attachment_width")
    var attachmentWidth: String = ""

    @SerializedName("attachment_height")
    var attachmentHeight: String = ""

    @SerializedName("alt")
    var alt: String = ""

    @SerializedName("viewable_type")
    var viewableType: String = ""

    @SerializedName("viewable_id")
    var viewableId: Int = 0

    @SerializedName("mini_url")
    var miniUrl: String = ""

    @SerializedName("small_url")
    val smallUrl: String = ""

    @SerializedName("product_url")
    val productUrl: String = ""

    @SerializedName("large_url")
    val largeUrl: String = ""

    @SerializedName("pdp_thumbnail_url")
    val pdpThumbnailUrl: String = ""

    @SerializedName("plp_and_carousel_url")
    val plpAndCarouselUrl: String = ""

    @SerializedName("plp_and_carousel_xs_url")
    val plpAndCarouselXsUrl: String = ""

    @SerializedName("plp_and_carousel_sm_url")
    val plpAndCarouselSmUrl: String = ""

    @SerializedName("plp_and_carousel_md_url")
    val plpAndCarouselMdUrl: String = ""

    @SerializedName("plp_and_carousel_lg_url")
    val plpAndCarouselLgUrl: String = ""

    @SerializedName("plp_url")
    val plpUrl: String = ""

    @SerializedName("zoomed_url")
    val zoomedUrl: String = ""


}