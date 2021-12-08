package com.woocer.test.di

import com.google.firebase.database.FirebaseDatabase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.woocer.test.domain.repository.AppRepository
import com.woocer.test.data.AppRepositoryImp
import com.woocer.test.data.local.dao.AppDao
import com.woocer.test.data.local.firebase.FireBaseRepoImpl
import com.woocer.test.data.remote.ApiService
import com.woocer.test.util.NetworkConnectivity
import dagger.Provides
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideAppRepository(
        apiService: ApiService,
        appDao: AppDao,
        fireBaseRepoImpl: FireBaseRepoImpl,
    ): AppRepository {
        return AppRepositoryImp(apiService, appDao, fireBaseRepoImpl)
    }


    @Provides
    @Singleton
    fun provideFireBaseRepoImpl(): FireBaseRepoImpl {
        return FireBaseRepoImpl(FirebaseDatabase.getInstance())
    }

}