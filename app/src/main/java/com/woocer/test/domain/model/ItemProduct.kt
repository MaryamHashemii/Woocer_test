package com.woocer.test.domain.model

import com.woocer.test.data.local.dto.ItemProductRepositoryModel


data class ItemProduct(
    val id: Int,
    val name: String,
    val images:String,
    val price: String,

    )

fun ItemProduct.toItemProductRepositoryModel(): ItemProductRepositoryModel =

    ItemProductRepositoryModel(
        id = id,
        image = images,
        name = name,
        price = price
    )

fun List<ItemProduct>.toItemProductRepositoryModelList(): List<ItemProductRepositoryModel> {
    return map {
        ItemProductRepositoryModel(
            id = it.id,
            image = it.images,
            name = it.name,
            price = it.price

        )
    }
}

fun List<ItemProductRepositoryModel>.toItemProductRepositoryModelList2(): List<ItemProduct> {
    return map {
        ItemProduct(
            id = it.id,
            images = it.image,
            name = it.name,
            price = it.price

        )
    }
}

