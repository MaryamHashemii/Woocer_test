package com.woocer.test.data.local.firebase

import android.util.Log
import androidx.annotation.NonNull
import com.google.firebase.database.*
import com.woocer.test.domain.model.ItemProduct
import com.woocer.test.data.local.dto.ItemProductRepositoryModel
import com.woocer.test.domain.model.toItemProductRepositoryModelList
import java.util.ArrayList
import javax.inject.Inject

class FireBaseRepoImpl @Inject constructor(
    firebaseDatabase: FirebaseDatabase
) : FirebaseRepo {

    var ref: DatabaseReference = firebaseDatabase.getReference("ItemProducts")


    override suspend fun getListRepositories(): List<ItemProductRepositoryModel> {
        val itemList = ArrayList<ItemProduct>()
        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (postSnapshot in snapshot.children) {
                    val item: ItemProduct? = postSnapshot.getValue(ItemProduct::class.java)
                    item?.let { itemList.add(it) }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.i("f", "fail add")
            }
        })
        return itemList.toItemProductRepositoryModelList()
    }

    override suspend fun saveListRepositories(items: List<ItemProduct>) {
        ref.also {
            it.keepSynced(true)
            it.child("ItemProducts").child("ItemProduct")
                .addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(@NonNull snapshot: DataSnapshot) {
                        for (item in items) {
                            ref.setValue(item)
                        }

                        Log.i("f", "data add")
                    }

                    override fun onCancelled(@NonNull error: DatabaseError) {
                        Log.i("f", "fail add")
                    }
                })
        }

    }
}