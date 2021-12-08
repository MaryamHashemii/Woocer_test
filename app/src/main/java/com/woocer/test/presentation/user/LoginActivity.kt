package com.woocer.test.presentation.user

import com.woocer.test.R
import com.woocer.test.base.BaseDataBindingActivity
import com.woocer.test.base.ObserverDataBindingActivity
import com.woocer.test.databinding.ActivityLoginBinding
import com.woocer.test.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity: BaseDataBindingActivity<ActivityLoginBinding>(R.layout.activity_login) {
    override fun setupViews() {
    }
}