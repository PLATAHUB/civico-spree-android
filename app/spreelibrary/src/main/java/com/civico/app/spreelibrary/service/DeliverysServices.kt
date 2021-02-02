package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.api.ApiClientDelivery
import com.civico.app.spreelibrary.api.model.OrderResponse
import com.civico.app.spreelibrary.model.delivery.DeliveryInformation
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object DeliverysServices {

    @JvmStatic fun addDelivery(userToken: String, idClient: String, deliveryInformation: DeliveryInformation, dataCallback: DataCallback<DeliveryInformation>)  {
        ApiClientDelivery.apiService.addDelivery(userToken, idClient, deliveryInformation).enqueue(object : Callback<DeliveryInformation> {
            override fun onResponse(call: Call<DeliveryInformation>, response: Response<DeliveryInformation>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<DeliveryInformation>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    @JvmStatic fun getOrders(userToken: String, idClient: String, dataCallback: DataCallback<DeliveryInformation>)  {
        ApiClientDelivery.apiService.getDelivery(userToken, idClient).enqueue(object : Callback<DeliveryInformation> {
            override fun onResponse(call: Call<DeliveryInformation>, response: Response<DeliveryInformation>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<DeliveryInformation>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }
}