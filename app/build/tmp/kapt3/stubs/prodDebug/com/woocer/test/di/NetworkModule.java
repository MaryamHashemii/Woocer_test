package com.woocer.test.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocer/test/di/NetworkModule;", "", "()V", "provideApiService", "Lcom/woocer/test/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideHttpClient", "Lokhttp3/OkHttpClient;", "httpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "authInterceptor", "Lcom/woocer/test/data/remote/AuthInterceptor;", "provideLoggingInterceptor", "provideRetrofit", "okHttpClient", "userSharedPref", "Lcom/woocer/test/data/sharedPref/UserSharedPref;", "app_prodDebug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocer.test.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.woocer.test.data.remote.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.woocer.test.data.sharedPref.UserSharedPref userSharedPref) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor, @org.jetbrains.annotations.NotNull()
    com.woocer.test.data.remote.AuthInterceptor authInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
}