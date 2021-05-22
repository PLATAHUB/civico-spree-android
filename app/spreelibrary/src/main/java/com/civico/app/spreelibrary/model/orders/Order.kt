package com.civico.app.spreelibrary.model.orders

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Order : Serializable{

    @SerializedName("id")
    var id:Int? = null

    @SerializedName("number")
    var number:String? = null

    @SerializedName("item_total")
    var itemTotal:String? = null

    @SerializedName("total")
    var total:String? = null

    @SerializedName("ship_total")
    var shipTotal:String? = null

    @SerializedName("state")
    var state:String? = null

    @SerializedName("adjustment_total")
    var adjustmentTotal:String? = null

    @SerializedName("user_id")
    var userId:Int? = null

    @SerializedName("created_at")
    var createdAt:String? = null

    @SerializedName("updated_at")
    var updatedAt:String? = null

    @SerializedName("completed_at")
    var completedAt:String? = null

    @SerializedName("payment_total")
    var paymentTotal:String? = null

    @SerializedName("shipment_state")
    var shipmentState:String? = null

    @SerializedName("payment_state")
    var paymentState:String? = null

    @SerializedName("email")
    var email:String? = null

    @SerializedName("special_instructions")
    var specialInstructions:String? = null

    @SerializedName("channel")
    var channel:String? = null

    @SerializedName("included_tax_total")
    var includedTaxTotal:String? = null

    @SerializedName("additional_tax_total")
    var additionalTaxTotal:String? = null

    @SerializedName("display_included_tax_total")
    var displayIncludedTaxTotal:String? = null

    @SerializedName("display_additional_tax_total")
    var displayAdditionalTaxTotal:String? = null

    @SerializedName("tax_total")
    var taxTotal:String? = null

    @SerializedName("currency")
    var currency:String? = null

    @SerializedName("considered_risky")
    var consideredRisky:Boolean? = null

    @SerializedName("canceler_id")
    var cancelerId:String? = null

    @SerializedName("display_item_total")
    var displayItemTotal:String? = null

    @SerializedName("total_quantity")
    var totalQuantity:Int? = null

    @SerializedName("display_total")
    var displayTotal:String? = null

    @SerializedName("display_ship_total")
    var displayShipTotal:String? = null

    @SerializedName("display_tax_total")
    var displayTaxTotal:String? = null

    @SerializedName("display_adjustment_total")
    var displayAdjustmentTotal:String? = null

    @SerializedName("token")
    var token:String? = null

    @SerializedName("checkout_steps")
    var checkoutSteps:List<String> = ArrayList()

    @SerializedName("bill_address")
    var billAddress:Address? = null

    @SerializedName("ship_address")
    var shipAddress:Address? = null

    @SerializedName("line_items")
    var lineItems:List<LineItem>? = ArrayList()

    @SerializedName("payments")
    var payments:List<Payment> = ArrayList()

    @SerializedName("shipments")
    var shipments:List<Shipment> = ArrayList()

    @SerializedName("adjustments")
    var adjustments:List<Adjustment> = ArrayList()

    @SerializedName("credit_cards")
    var creditCards:List<String>? = null

    @SerializedName("permissions")
    var permissions:Map<String, Boolean>? = null

    @SerializedName("bill_address_attributes")
    var billingAddressToBeAdded: Address? = null

    @SerializedName("ship_address_attributes")
    var shippingAddressToBeAdded: Address? = null

    override fun toString(): String {
        return "Order(id=$id, number='$number', itemTotal='$itemTotal', total='$total', shipTotal='$shipTotal', state='$state', adjustmentTotal='$adjustmentTotal', userId=$userId, createdAt='$createdAt', updatedAt='$updatedAt', completedAt='$completedAt', paymentTotal='$paymentTotal', shipmentState='$shipmentState', paymentState='$paymentState', email='$email', specialInstructions='$specialInstructions', channel='$channel', includedTaxTotal='$includedTaxTotal', additionalTaxTotal='$additionalTaxTotal', displayIncludedTaxTotal='$displayIncludedTaxTotal', displayAdditionalTaxTotal='$displayAdditionalTaxTotal', taxTotal='$taxTotal', currency='$currency', consideredRisky=$consideredRisky, cancelerId='$cancelerId', displayItemTotal='$displayItemTotal', totalQuantity=$totalQuantity, displayTotal='$displayTotal', displayShipTotal='$displayShipTotal', displayTaxTotal='$displayTaxTotal', displayAdjustmentTotal='$displayAdjustmentTotal', token='$token', checkoutSteps=$checkoutSteps, billAddress=$billAddress, shipAddress=$shipAddress, lineItems=$lineItems, payments=$payments, shipments=$shipments, adjustments=$adjustments, creditCards=$creditCards, permissions=$permissions)"
    }

}