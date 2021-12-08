package com.woocer.test.data.remote

import com.woocer.test.common.Constants
import com.woocer.test.data.sharedPref.UserSharedPref
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(
    private val userSharedPref: UserSharedPref
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val request = original
            .newBuilder()
            .url(

                userSharedPref.let {
                    original.url.newBuilder().addQueryParameter(
                        "consumer_key",
                        it.consumer_key
                    )
                        .addQueryParameter(
                            "consumer_secret",
                            it.consumer_secret

                        )
                }
                    .build()
            )
            .build()
        return chain.proceed(request)


    }
}