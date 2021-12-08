package com.woocer.test.presentation.product;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/woocer/test/presentation/product/ProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocer/test/presentation/product/ProductAdapter$ProductViewHolder;", "imageLoadingService", "Lcom/woocer/test/common/imageloading/ImageLoadingService;", "(Lcom/woocer/test/common/imageloading/ImageLoadingService;)V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocer/test/domain/model/ItemProduct;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "data", "", "ProductViewHolder", "app_prodDebug"})
public final class ProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocer.test.presentation.product.ProductAdapter.ProductViewHolder> {
    private final com.woocer.test.common.imageloading.ImageLoadingService imageLoadingService = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocer.test.domain.model.ItemProduct> diffCallback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.woocer.test.domain.model.ItemProduct> differ = null;
    
    @javax.inject.Inject()
    public ProductAdapter(@org.jetbrains.annotations.NotNull()
    com.woocer.test.common.imageloading.ImageLoadingService imageLoadingService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocer.test.presentation.product.ProductAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocer.test.presentation.product.ProductAdapter.ProductViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.domain.model.ItemProduct> data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/woocer/test/presentation/product/ProductAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/woocer/test/databinding/ItemProductBinding;", "imageLoadingService", "Lcom/woocer/test/common/imageloading/ImageLoadingService;", "(Lcom/woocer/test/databinding/ItemProductBinding;Lcom/woocer/test/common/imageloading/ImageLoadingService;)V", "bind", "", "data", "Lcom/woocer/test/domain/model/ItemProduct;", "app_prodDebug"})
    public static final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.woocer.test.databinding.ItemProductBinding binding = null;
        private final com.woocer.test.common.imageloading.ImageLoadingService imageLoadingService = null;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocer.test.databinding.ItemProductBinding binding, @org.jetbrains.annotations.NotNull()
        com.woocer.test.common.imageloading.ImageLoadingService imageLoadingService) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocer.test.domain.model.ItemProduct data) {
        }
    }
}