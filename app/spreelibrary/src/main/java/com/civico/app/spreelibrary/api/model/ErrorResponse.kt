package com.civico.app.spreelibrary.api.model

import com.civico.app.spreelibrary.model.Errors
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ErrorResponse: Serializable {

    @SerializedName("error")
    var error: String = ""

    @SerializedName("errors")
    var errors: Errors? = null

    override fun toString(): String {
        return "ErrorResponse(error='$error')"
    }


}