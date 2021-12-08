package com.woocer.test.data

import com.woocer.test.data.local.dao.AppDao
import com.woocer.test.data.remote.ApiService
import com.woocer.test.data.remote.dto.response.toItemProductList
import com.woocer.test.domain.model.ItemProduct
import com.woocer.test.domain.model.toItemProductRepositoryModelList
import com.woocer.test.domain.repository.AppRepository
import javax.inject.Inject
import com.woocer.test.util.NetworkConnectivity
import com.woocer.test.data.local.firebase.FireBaseRepoImpl
import com.woocer.test.domain.model.toItemProductRepositoryModelList2
import com.woocer.test.result.data
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import com.woocer.test.result.Result
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart


class AppRepositoryImp @Inject constructor(
    private val apiService: ApiService,
    private val appDao: AppDao,
    private val fireBaseRepoImpl: FireBaseRepoImpl,
) : AppRepository {


    override suspend fun getAllProduct(): Flow<List<ItemProduct>> {

        try {
            val result = apiService.getAllProducts()
            appDao.saveListRepositories(result.toItemProductList().toItemProductRepositoryModelList())
            fireBaseRepoImpl.saveListRepositories(result.toItemProductList())
        } catch (e: Exception){
            // TODO: 12/8/21 handle error when cant fetch data from network
        }

        return appDao.getListRepositories().map {
            it.toItemProductRepositoryModelList2()
        }
    }
}

