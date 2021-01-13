package com.civico.app.spreelibrary.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient(token: String) {

    val BASE_API_URL:String = "https://cmkpbeta.civico.com/bogota/productos/api/v1/"
    var apiService:ApiService

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .client(makeOkHttpClient(token))
            .baseUrl(BASE_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        apiService = retrofit.create(ApiService::class.java)
    }

    private fun makeOkHttpClient(token:String): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(AuthorizationInterceptor(token))
            .build()
    }

}