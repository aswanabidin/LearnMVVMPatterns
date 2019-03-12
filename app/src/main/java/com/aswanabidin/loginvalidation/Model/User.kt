package com.aswanabidin.loginvalidation.Model

import android.databinding.BaseObservable
import android.text.TextUtils
import android.util.Patterns

/**
 * Created by aswanabidin on 3/11/2019
 */

class User(private var email: String, private var password: String) : BaseObservable() {

    val isDataValid : Boolean
    get() = (!TextUtils.isEmpty(getEmail()))
            && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
            && getPassword().length > 6

    fun getEmail() : String {
        return email
    }

    fun getPassword() : String {
        return password
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun setPassword(password: String) {
        this.password = password
    }
}