package com.civico.app.spreelibrary.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClientDelivery private constructor(url: String) {

    var apiService: ApiService

    init {
        val retrofit: Retrofit = Retrofit.Builder()
                //.client(makeOkHttpClient())
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        apiService = retrofit.create(ApiService::class.java)
    }

    private fun makeOkHttpClient(token: String=""): OkHttpClient {

        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient.Builder()
                /*.addInterceptor(AuthorizationInterceptor(token))*/.addInterceptor(logging)
                .build()
    }

    companion object {
        @Volatile
        private var INSTANCE: ApiClientDelivery? = null

        @Synchronized
        fun getInstance(param: String): ApiClientDelivery = INSTANCE ?: ApiClientDelivery(param).also { INSTANCE = it }
    }
}