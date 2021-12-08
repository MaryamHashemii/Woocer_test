package com.woocer.test.data.sharedPref

import android.content.Context
import androidx.core.content.edit
import com.woocer.test.data.sharedPref.UserSharedPref.UserSharedPrefKeys.CONSUMER_KEY
import com.woocer.test.data.sharedPref.UserSharedPref.UserSharedPrefKeys.CONSUMER_SECRET
import dagger.hilt.android.qualifiers.ApplicationContext
import com.woocer.test.data.sharedPref.UserSharedPref.UserSharedPrefKeys.USER_PREF_NAME
import com.woocer.test.data.sharedPref.UserSharedPref.UserSharedPrefKeys.WEBSITE
import javax.inject.Inject

class UserSharedPref @Inject constructor(@ApplicationContext context: Context) {

    object UserSharedPrefKeys {
        const val USER_PREF_NAME = "user_pref"
        const val WEBSITE = "website"
        const val CONSUMER_KEY = "consumer_key"
        const val CONSUMER_SECRET = "consumer_secret"

    }

    private val sharedPref = context.getSharedPreferences(USER_PREF_NAME, Context.MODE_PRIVATE)
    private val editor = sharedPref.edit()

    var website: String? = null
        set(value) {
            sharedPref.edit {
                putString(WEBSITE, value)
            }
            field = value
        }
        get() = sharedPref.getString(WEBSITE, null)

    var consumer_key: String? = null
        set(value) {
            sharedPref.edit {
                putString(CONSUMER_KEY, value)
            }
            field = value
        }
        get() = sharedPref.getString(CONSUMER_KEY, null)

    var consumer_secret: String? = null
        set(value) {
            sharedPref.edit {
                putString(CONSUMER_SECRET, value)
            }
            field = value
        }
        get() = sharedPref.getString(CONSUMER_SECRET, null)
}