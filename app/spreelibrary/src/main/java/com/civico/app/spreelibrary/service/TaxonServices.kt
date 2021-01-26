package com.civico.app.spreelibrary.service

import com.civico.app.spreelibrary.api.ApiClient
import com.civico.app.spreelibrary.model.products.Image
import com.civico.app.spreelibrary.model.products.Product
import com.civico.app.spreelibrary.api.model.ProductResponse
import com.civico.app.spreelibrary.api.model.TaxonResponse
import com.civico.app.spreelibrary.model.categories.Taxon
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *
 * @author @andresad13
 */
object TaxonServices {




    fun getTaxons(userToken:String, taxonId:Int=1, dataCallback: DataCallback<TaxonResponse> ){
        ApiClient.apiService.getTaxonomies(userToken, taxonId).enqueue(object : Callback<TaxonResponse>{
            override fun onResponse(call: Call<TaxonResponse>, response: Response<TaxonResponse>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }
            override fun onFailure(call: Call<TaxonResponse>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }

    fun getTaxon(userToken:String, taxonsId:Int=1, taxonId:Int=1, dataCallback: DataCallback<Taxon> ){
        ApiClient.apiService.getTaxonomie(userToken, taxonsId, taxonId).enqueue(object : Callback<Taxon> {
            override fun onResponse(call: Call<Taxon>, response: Response<Taxon>) {
                Utils.executeCorrectResponse(response, dataCallback)
            }
            override fun onFailure(call: Call<Taxon>, t: Throwable) {
                Utils.executeFailedResponse(t, dataCallback)
            }
        })
    }





}