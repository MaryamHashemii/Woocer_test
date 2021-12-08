package com.woocer.test.presentation.user

import android.content.Intent
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import com.woocer.test.base.BaseDataBindingFragment
import com.woocer.test.R
import com.woocer.test.databinding.FragmentLoginBinding
import com.woocer.test.domain.model.Authentication
import com.woocer.test.presentation.main.MainActivity
import com.woocer.test.util.extensions.toast

@AndroidEntryPoint
class LoginFragment
    : BaseDataBindingFragment<FragmentLoginBinding>(R.layout.fragment_login) {

    private val loginViewModel: LoginViewModel by viewModels()

    override fun setupViews() {
        binding.btnLogin.setOnClickListener {
            if (binding.edtName.text?.isNotEmpty()!! && binding.edtEmail.text?.isNotEmpty()!! &&
                binding.edtWebsite.text?.isNotEmpty()!! && binding.edtConsumerKey.text?.isNotEmpty()!! && binding.edtConsumerSecret.text?.isNotEmpty()!!
            ) {
                requireContext().toast("you should fill all of them")
            } else {
                loginViewModel.login(
                    Authentication(
                        binding.edtWebsite.text.toString(),
                        binding.edtConsumerKey.text.toString(),
                        binding.edtConsumerSecret.text.toString()
                    )
                )
                startActivity(Intent(activity, MainActivity::class.java))
                activity?.finish()
            }
        }


    }

}