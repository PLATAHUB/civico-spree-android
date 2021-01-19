package com.civico.app.spreelibrary.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Errors: Serializable {

    @SerializedName("base")
    var base:List<String> = ArrayList()

    @SerializedName("bill_address.state")
    var billAddressS:List<String> = ArrayList()

    @SerializedName("bill_address.zipcode")
    var billAddressZ:List<String> = ArrayList()

    @SerializedName("ship_address.state")
    var shipAddressS:List<String> = ArrayList()

    @SerializedName("ship_address.zipcode")
    var shipAddressZ:List<String> = ArrayList()

}