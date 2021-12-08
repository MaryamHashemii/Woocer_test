package com.woocer.test.presentation.product

import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import com.woocer.test.base.ObserverDataBindingFragment
import javax.inject.Inject
import com.woocer.test.result.Result
import com.woocer.test.R
import com.woocer.test.databinding.FragmentProductBinding
import com.woocer.test.util.extensions.hide
import com.woocer.test.util.extensions.show
import com.woocer.test.util.extensions.toast

@AndroidEntryPoint
class ProductFragment :
    ObserverDataBindingFragment<FragmentProductBinding>(R.layout.fragment_product) {
    private val productViewModel: ProductViewModel by viewModels()

    @Inject
    lateinit var productAdapter: ProductAdapter

    override fun setupViews() {
        binding.rvActionButtons.adapter = productAdapter
    }

    override fun observe() {
        productViewModel.products.observe(this) { result ->
            when (result) {
                is Result.Loading -> {
                    binding.progress.show()
                }

                is Result.Success -> {
                    binding.progress.hide()
                    productAdapter.submitList(result.data)
                }
                is Result.Error -> {
                    context?.toast(result.exception.message.toString())
                    Log.i("niloooo",result.exception.message.toString())
                }
            }
        }
    }
}