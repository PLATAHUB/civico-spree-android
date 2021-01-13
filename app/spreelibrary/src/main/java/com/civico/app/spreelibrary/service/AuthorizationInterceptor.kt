package com.civico.app.spreelibrary.service

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class AuthorizationInterceptor (var token:String): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()
        request = request.newBuilder().addHeader("X-Spree-Token", token).build()
        return chain.proceed(request)
    }
}