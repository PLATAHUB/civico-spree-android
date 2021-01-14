package com.civico.app.spreelibrary.api.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ErrorResponse: Serializable {

    @SerializedName("error")
    var error: String = ""

    override fun toString(): String {
        return "ErrorResponse(error='$error')"
    }


}