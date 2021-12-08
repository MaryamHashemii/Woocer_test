package com.woocer.test.data.sharedPref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R*\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/woocer/test/data/sharedPref/UserSharedPref;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "consumer_key", "getConsumer_key", "()Ljava/lang/String;", "setConsumer_key", "(Ljava/lang/String;)V", "consumer_secret", "getConsumer_secret", "setConsumer_secret", "editor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "sharedPref", "Landroid/content/SharedPreferences;", "website", "getWebsite", "setWebsite", "UserSharedPrefKeys", "app_prodDebug"})
public final class UserSharedPref {
    private final android.content.SharedPreferences sharedPref = null;
    private final android.content.SharedPreferences.Editor editor = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String website;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String consumer_key;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String consumer_secret;
    
    @javax.inject.Inject()
    public UserSharedPref(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    public final void setWebsite(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWebsite() {
        return null;
    }
    
    public final void setConsumer_key(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConsumer_key() {
        return null;
    }
    
    public final void setConsumer_secret(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConsumer_secret() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocer/test/data/sharedPref/UserSharedPref$UserSharedPrefKeys;", "", "()V", "CONSUMER_KEY", "", "CONSUMER_SECRET", "USER_PREF_NAME", "WEBSITE", "app_prodDebug"})
    public static final class UserSharedPrefKeys {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocer.test.data.sharedPref.UserSharedPref.UserSharedPrefKeys INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_PREF_NAME = "user_pref";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEBSITE = "website";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONSUMER_KEY = "consumer_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONSUMER_SECRET = "consumer_secret";
        
        private UserSharedPrefKeys() {
            super();
        }
    }
}