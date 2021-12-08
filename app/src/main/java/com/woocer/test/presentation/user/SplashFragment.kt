package com.woocer.test.presentation.user

import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.woocer.test.R
import com.woocer.test.base.BaseDataBindingFragment
import com.woocer.test.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashFragment:BaseDataBindingFragment<FragmentSplashBinding>(R.layout.fragment_splash) {
    override fun setupViews() {
        lifecycleScope.launch {
            delay(2000L)
            findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
        }

    }
}