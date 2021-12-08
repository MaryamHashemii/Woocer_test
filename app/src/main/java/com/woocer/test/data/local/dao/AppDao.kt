package com.woocer.test.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.woocer.test.data.local.dto.ItemProductRepositoryModel
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {

    @Query("SELECT * FROM product")
    fun getListRepositories(): Flow<List<ItemProductRepositoryModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveListRepositories(listTrivia: List<ItemProductRepositoryModel>)
}