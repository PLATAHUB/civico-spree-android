package com.civico.app.spreelibrary.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class OptionValue: Serializable {

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("name")
    var name:String = ""

    @SerializedName("presentation")
    var presetation:String = ""

    @SerializedName("option_type_name")
    var optionTypeName:String = ""

    @SerializedName("option_type_id")
    var optionTypeId:Int = 0

    @SerializedName("option_type_presentation")
    var optionTypePresentation:String = ""

}