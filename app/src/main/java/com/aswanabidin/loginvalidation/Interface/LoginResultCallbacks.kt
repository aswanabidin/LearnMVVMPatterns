package com.aswanabidin.loginvalidation.Interface

/**
 * Created by aswanabidin on 3/11/2019
 */
interface LoginResultCallbacks {
    fun onSuccess(message: String)
    fun onError(message: String)

}