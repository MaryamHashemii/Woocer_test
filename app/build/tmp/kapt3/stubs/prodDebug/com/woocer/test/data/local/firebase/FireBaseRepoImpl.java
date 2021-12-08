package com.woocer.test.data.local.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/woocer/test/data/local/firebase/FireBaseRepoImpl;", "Lcom/woocer/test/data/local/firebase/FirebaseRepo;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "ref", "Lcom/google/firebase/database/DatabaseReference;", "getRef", "()Lcom/google/firebase/database/DatabaseReference;", "setRef", "(Lcom/google/firebase/database/DatabaseReference;)V", "getListRepositories", "", "Lcom/woocer/test/data/local/dto/ItemProductRepositoryModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveListRepositories", "", "items", "Lcom/woocer/test/domain/model/ItemProduct;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class FireBaseRepoImpl implements com.woocer.test.data.local.firebase.FirebaseRepo {
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.database.DatabaseReference ref;
    
    @javax.inject.Inject()
    public FireBaseRepoImpl(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase firebaseDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getRef() {
        return null;
    }
    
    public final void setRef(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getListRepositories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocer.test.data.local.dto.ItemProductRepositoryModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveListRepositories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.domain.model.ItemProduct> items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}