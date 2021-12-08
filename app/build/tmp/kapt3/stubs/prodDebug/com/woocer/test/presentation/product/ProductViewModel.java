package com.woocer.test.presentation.product;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/woocer/test/presentation/product/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "productUseCase", "Lcom/woocer/test/domain/usecase/ProductUseCase;", "(Lcom/woocer/test/domain/usecase/ProductUseCase;)V", "products", "Landroidx/lifecycle/LiveData;", "Lcom/woocer/test/result/Result;", "", "Lcom/woocer/test/domain/model/ItemProduct;", "getProducts", "()Landroidx/lifecycle/LiveData;", "app_prodDebug"})
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    private final com.woocer.test.domain.usecase.ProductUseCase productUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocer.test.result.Result<java.util.List<com.woocer.test.domain.model.ItemProduct>>> products = null;
    
    @javax.inject.Inject()
    public ProductViewModel(@org.jetbrains.annotations.NotNull()
    com.woocer.test.domain.usecase.ProductUseCase productUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocer.test.result.Result<java.util.List<com.woocer.test.domain.model.ItemProduct>>> getProducts() {
        return null;
    }
}