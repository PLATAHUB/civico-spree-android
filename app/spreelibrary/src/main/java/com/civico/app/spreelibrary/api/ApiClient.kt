package com.civico.app.spreelibrary.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 *
 * @author caflorezvi
 */
class ApiClient private constructor(token: String) {

    private val BASE_API_URL:String = "https://cmkpbeta.civico.com/bogota/productos/api/v1/"
    var apiService: ApiService

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .client(makeOkHttpClient(token))
            .baseUrl(BASE_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        apiService = retrofit.create(ApiService::class.java)
    }

    private fun makeOkHttpClient(token: String): OkHttpClient {

        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient.Builder()
            .addInterceptor(AuthorizationInterceptor(token)).addInterceptor(logging)
            .build()
    }

    companion object {
        @Volatile
        private var INSTANCE: ApiClient? = null

        @Synchronized
        fun getInstance(param: String): ApiClient = INSTANCE ?: ApiClient(param).also { INSTANCE = it }
    }

}