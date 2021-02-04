package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.api.ApiClientDelivery
import com.civico.app.spreelibrary.api.model.OrderResponse
import com.civico.app.spreelibrary.model.delivery.DeliveryConfiguration
import com.civico.app.spreelibrary.model.delivery.DeliveryInformation
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object DeliverysServices {

    @JvmStatic fun addDelivery(idClient: String, userToken: String, deliveryInformation: DeliveryInformation, dataCallback: DataCallback<DeliveryInformation>)  {
        ApiClientDelivery.apiService.addDelivery(idClient, userToken, deliveryInformation).enqueue(object : Callback<DeliveryInformation> {
            override fun onResponse(call: Call<DeliveryInformation>, response: Response<DeliveryInformation>) {
                Utils.executeCorrectResponseDelivery(response, dataCallback)
            }

            override fun onFailure(call: Call<DeliveryInformation>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    @JvmStatic fun getDelivery(idClient: String, userToken: String, dataCallback: DataCallback<DeliveryConfiguration>)  {
        ApiClientDelivery.apiService.getDelivery(idClient, userToken).enqueue(object : Callback<DeliveryConfiguration> {
            override fun onResponse(call: Call<DeliveryConfiguration>, response: Response<DeliveryConfiguration>) {
                Utils.executeCorrectResponseDelivery(response, dataCallback)
            }

            override fun onFailure(call: Call<DeliveryConfiguration>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }
}