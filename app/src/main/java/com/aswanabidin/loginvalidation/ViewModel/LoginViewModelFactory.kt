package com.aswanabidin.loginvalidation.ViewModel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.aswanabidin.loginvalidation.Interface.LoginResultCallbacks

/**
 * Created by aswanabidin on 3/12/2019
 */
class LoginViewModelFactory(private val listener: LoginResultCallbacks) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create (modelClass: Class<T>): T {
        return LoginViewModel(listener) as T
    }
}