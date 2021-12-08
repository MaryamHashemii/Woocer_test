package com.woocer.test.presentation.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.woocer.test.data.sharedPref.UserSharedPref
import com.woocer.test.domain.model.Authentication
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val userSharedPref: UserSharedPref
) : ViewModel() {

    fun login(authentication: Authentication) {

        viewModelScope.launch {

            //actually should filled with the result of wich return by server via usecase like in product
            //but i do not have any service

            userSharedPref.website = authentication.website
            userSharedPref.consumer_key = authentication.consumerKey
            userSharedPref.consumer_secret = authentication.consumerSecret

        }
    }
}