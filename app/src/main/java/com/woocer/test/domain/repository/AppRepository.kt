package com.woocer.test.domain.repository

import com.woocer.test.domain.model.ItemProduct
import  com.woocer.test.result.Result
import kotlinx.coroutines.flow.Flow

interface AppRepository {

    suspend fun getAllProduct(): Flow<List<ItemProduct>>

}