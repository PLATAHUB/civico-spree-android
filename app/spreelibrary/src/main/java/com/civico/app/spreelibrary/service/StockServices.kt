package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.api.model.OrderWrapper
import com.civico.app.spreelibrary.model.products.Image
import com.civico.app.spreelibrary.model.products.Product
import com.civico.app.spreelibrary.api.model.ProductResponse
import com.civico.app.spreelibrary.model.orders.Order
import com.civico.app.spreelibrary.model.products.ProductBussines
import com.civico.app.spreelibrary.model.products.ProductConfiguration
import com.civico.app.spreelibrary.model.stock.StockItem
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *
 * @author caflorezvi
 */

object StockServices {

    fun updateStock(userToken: String, idProduct: Int, stockItem: StockItem, dataCallback: DataCallback<StockItem>){
        ApiClient.apiService.updateStock(userToken, idProduct, stockItem).enqueue(object : Callback<StockItem> {
            override fun onResponse(call: Call<StockItem>, response: Response<StockItem>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }

            override fun onFailure(call: Call<StockItem>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }

        })
    }
}