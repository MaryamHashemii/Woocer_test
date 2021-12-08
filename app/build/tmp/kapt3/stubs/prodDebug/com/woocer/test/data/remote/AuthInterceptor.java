package com.woocer.test.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocer/test/data/remote/AuthInterceptor;", "Lokhttp3/Interceptor;", "userSharedPref", "Lcom/woocer/test/data/sharedPref/UserSharedPref;", "(Lcom/woocer/test/data/sharedPref/UserSharedPref;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_prodDebug"})
public final class AuthInterceptor implements okhttp3.Interceptor {
    private final com.woocer.test.data.sharedPref.UserSharedPref userSharedPref = null;
    
    @javax.inject.Inject()
    public AuthInterceptor(@org.jetbrains.annotations.NotNull()
    com.woocer.test.data.sharedPref.UserSharedPref userSharedPref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}