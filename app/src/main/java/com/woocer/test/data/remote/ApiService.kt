package com.woocer.test.data.remote

import com.woocer.test.data.remote.dto.response.ProductsItem
import retrofit2.http.GET
import  com.woocer.test.result.Result
import kotlinx.coroutines.flow.Flow

interface ApiService {


    @GET("wp-json/wc/v3/products")
    suspend fun getAllProducts(): List<ProductsItem>


}