package com.civico.app.spreelibrary.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 *
 * @author caflorezvi
 */
object ApiClient {

    private val BASE_API_URL:String = "https://cmkpbeta.civico.com/bogota/productos/api/v1/"

    val apiService: ApiService

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .client(makeOkHttpClient())
            .baseUrl(BASE_API_URL)
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

}