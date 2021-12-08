package com.woocer.test.domain.usecase

import com.woocer.test.di.coroutine.IoDispatcher
import com.woocer.test.domain.model.ItemProduct
import com.woocer.test.domain.repository.AppRepository
import com.woocer.test.domain.usecase.coroutin.FlowUseCase
import com.woocer.test.result.Result
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ProductUseCase @Inject constructor(
    private val appRepository: AppRepository,
    @IoDispatcher coroutineDispatcher: CoroutineDispatcher
) : FlowUseCase<Unit, List<ItemProduct>>(coroutineDispatcher) {

    override suspend fun execute(parameters: Unit): Flow<Result<List<ItemProduct>>> {
        return appRepository.getAllProduct()
            .map {
                Result.Success(it)
            }
            .catch {
                if (it is Exception)
                    Result.Error(it)
            }
    }
}