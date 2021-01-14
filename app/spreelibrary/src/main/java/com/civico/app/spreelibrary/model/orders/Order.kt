package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Order : Serializable{

    @SerializedName("id")
    var id:Int = 0

    @SerializedName("number")
    var number:String = ""

    @SerializedName("item_total")
    var itemTotal:String = ""

    @SerializedName("total")
    var total:String = ""

    @SerializedName("ship_total")
    var shipTotal:String = ""

    @SerializedName("state")
    var state:String = ""

    @SerializedName("adjustment_total")
    var adjustmentTotal:String = ""

    @SerializedName("user_id")
    var userId:Int = 0

    @SerializedName("created_at")
    var createdAt:String = ""

    @SerializedName("updated_at")
    var updatedAt:String = ""

    @SerializedName("completed_at")
    var completedAt:String = ""

    @SerializedName("payment_total")
    var paymentTotal:String = ""

    @SerializedName("shipment_state")
    var shipmentState:String = ""

    @SerializedName("payment_state")
    var paymentState:String = ""

    @SerializedName("email")
    var email:String = ""

    @SerializedName("special_instructions")
    var specialInstructions:String = ""

    @SerializedName("channel")
    var channel:String = ""

    @SerializedName("included_tax_total")
    var includedTaxTotal:String = ""

    @SerializedName("additional_tax_total")
    var additionalTaxTotal:String = ""

    @SerializedName("display_included_tax_total")
    var displayIncludedTaxTotal:String = ""

    @SerializedName("display_additional_tax_total")
    var displayAdditionalTaxTotal:String = ""

    @SerializedName("tax_total")
    var taxTotal:String = ""

    @SerializedName("currency")
    var currency:String = ""

    @SerializedName("considered_risky")
    var consideredRisky:Boolean = false

    @SerializedName("canceler_id")
    var cancelerId:String = ""

    @SerializedName("display_item_total")
    var displayItemTotal:String = ""

    @SerializedName("total_quantity")
    var totalQuantity:Int = 0

    @SerializedName("display_total")
    var displayTotal:String = ""

    @SerializedName("display_ship_total")
    var displayShipTotal:String = ""

    @SerializedName("display_tax_total")
    var displayTaxTotal:String = ""

    @SerializedName("display_adjustment_total")
    var displayAdjustmentTotal:String = ""

    @SerializedName("token")
    var token:String = ""

    @SerializedName("checkout_steps")
    var checkoutSteps:List<String> = ArrayList()

    @SerializedName("bill_address")
    var billAddress:Address? = null

    @SerializedName("ship_address")
    var shipAddress:Address? = null

    @SerializedName("line_items")
    var lineItems:List<LineItem> = ArrayList()

    @SerializedName("payments")
    var payments:List<Payment> = ArrayList()

    @SerializedName("shipments")
    var shipments:List<Shipment> = ArrayList()

    @SerializedName("adjustments")
    var adjustments:List<String>? = null

    @SerializedName("credit_cards")
    var creditCards:List<String>? = null

    @SerializedName("permissions")
    var permissions:Map<String, Boolean>? = null

    override fun toString(): String {
        return "Order(id=$id, number='$number', itemTotal='$itemTotal', total='$total', shipTotal='$shipTotal', state='$state', adjustmentTotal='$adjustmentTotal', userId=$userId, createdAt='$createdAt', updatedAt='$updatedAt', completedAt='$completedAt', paymentTotal='$paymentTotal', shipmentState='$shipmentState', paymentState='$paymentState', email='$email', specialInstructions='$specialInstructions', channel='$channel', includedTaxTotal='$includedTaxTotal', additionalTaxTotal='$additionalTaxTotal', displayIncludedTaxTotal='$displayIncludedTaxTotal', displayAdditionalTaxTotal='$displayAdditionalTaxTotal', taxTotal='$taxTotal', currency='$currency', consideredRisky=$consideredRisky, cancelerId='$cancelerId', displayItemTotal='$displayItemTotal', totalQuantity=$totalQuantity, displayTotal='$displayTotal', displayShipTotal='$displayShipTotal', displayTaxTotal='$displayTaxTotal', displayAdjustmentTotal='$displayAdjustmentTotal', token='$token', checkoutSteps=$checkoutSteps, billAddress=$billAddress, shipAddress=$shipAddress, lineItems=$lineItems, payments=$payments, shipments=$shipments, adjustments=$adjustments, creditCards=$creditCards, permissions=$permissions)"
    }

}