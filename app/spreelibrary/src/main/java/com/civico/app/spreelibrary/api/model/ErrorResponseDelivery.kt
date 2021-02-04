package com.civico.app.spreelibrary.api.model

import com.civico.app.spreelibrary.model.Errors
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ErrorResponseDelivery: Serializable {

    @SerializedName("errors")
    var errors: String = ""

    @SerializedName("error")
    var error: Error? = null

    override fun toString(): String {
        return "ErrorResponse(error='$errors')"
    }


}