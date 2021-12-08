package com.woocer.test.data.local.firebase

import com.woocer.test.domain.model.ItemProduct
import com.woocer.test.data.local.dto.ItemProductRepositoryModel

interface FirebaseRepo {
    suspend fun getListRepositories(): List<ItemProductRepositoryModel>

    suspend fun saveListRepositories(items: List<ItemProduct>)

}