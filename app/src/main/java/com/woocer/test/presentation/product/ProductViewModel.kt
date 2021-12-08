package com.woocer.test.presentation.product

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.woocer.test.domain.usecase.ProductUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val productUseCase: ProductUseCase
) : ViewModel() {
    val products = liveData {
        productUseCase(Unit).collect {
            emit(it)
        }


    }
}