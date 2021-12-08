package com.woocer.test.data.local.dto

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize
import com.woocer.test.data.remote.dto.response.Image

@Entity(tableName = "product", primaryKeys = ["id"])
@Parcelize
data class ItemProductRepositoryModel(
    val id: Int,
    val name: String,
    val image: String,
    val price: String,

    ) : Parcelable


