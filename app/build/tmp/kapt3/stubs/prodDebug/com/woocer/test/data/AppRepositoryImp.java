package com.woocer.test.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/woocer/test/data/AppRepositoryImp;", "Lcom/woocer/test/domain/repository/AppRepository;", "apiService", "Lcom/woocer/test/data/remote/ApiService;", "appDao", "Lcom/woocer/test/data/local/dao/AppDao;", "fireBaseRepoImpl", "Lcom/woocer/test/data/local/firebase/FireBaseRepoImpl;", "(Lcom/woocer/test/data/remote/ApiService;Lcom/woocer/test/data/local/dao/AppDao;Lcom/woocer/test/data/local/firebase/FireBaseRepoImpl;)V", "getAllProduct", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/woocer/test/domain/model/ItemProduct;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class AppRepositoryImp implements com.woocer.test.domain.repository.AppRepository {
    private final com.woocer.test.data.remote.ApiService apiService = null;
    private final com.woocer.test.data.local.dao.AppDao appDao = null;
    private final com.woocer.test.data.local.firebase.FireBaseRepoImpl fireBaseRepoImpl = null;
    
    @javax.inject.Inject()
    public AppRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.woocer.test.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.woocer.test.data.local.dao.AppDao appDao, @org.jetbrains.annotations.NotNull()
    com.woocer.test.data.local.firebase.FireBaseRepoImpl fireBaseRepoImpl) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllProduct(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.woocer.test.domain.model.ItemProduct>>> continuation) {
        return null;
    }
}