package com.woocer.test.presentation.product
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.woocer.test.common.imageloading.ImageLoadingService
import com.woocer.test.databinding.ItemProductBinding
import com.woocer.test.domain.model.ItemProduct
import javax.inject.Inject

class ProductAdapter @Inject constructor(
    private val imageLoadingService: ImageLoadingService
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    private val diffCallback = object : DiffUtil.ItemCallback<ItemProduct>() {
        override fun areItemsTheSame(oldItem: ItemProduct, newItem: ItemProduct): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: ItemProduct, newItem: ItemProduct): Boolean =
            oldItem == newItem


    }

    private val differ = AsyncListDiffer<ItemProduct>(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemProductBinding.inflate(inflater, parent, false)
        return ProductViewHolder(binding, imageLoadingService)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount() = differ.currentList.size

    fun submitList(data: List<ItemProduct>) {
        differ.submitList(data)
    }

    class ProductViewHolder(
        private val binding: ItemProductBinding,
        private val imageLoadingService: ImageLoadingService
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: ItemProduct) {
            imageLoadingService.loadImage(binding.ivPic, data.images)
            binding.tvTitle.text = data.name
            binding.tvPrice.text=data.price
        }

    }
}