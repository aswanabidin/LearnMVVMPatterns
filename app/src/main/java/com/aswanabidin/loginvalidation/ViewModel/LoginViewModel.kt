package com.aswanabidin.loginvalidation.ViewModel

import android.arch.lifecycle.ViewModel
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.aswanabidin.loginvalidation.Interface.LoginResultCallbacks
import com.aswanabidin.loginvalidation.Model.User

/**
 * Created by aswanabidin on 3/11/2019
 */

class LoginViewModel (private val listener: LoginResultCallbacks) : ViewModel() {
    private val user: User

    init {
        this.user = User("", "")
    }

    //Create function to set Email after user finish enter text
    val emailTextWatcher: TextWatcher
    get() = object: TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            user.setEmail(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }
    }


    //Create function to set Password after user finish enter text
    val passwordTextWatcher: TextWatcher
        get() = object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                user.setEmail(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        }


    //Create function to process Login button clicked
    fun onLoginClicked(v: View){
        if (user.isDataValid){
            listener.onSuccess("Login Success")
        } else {
            listener.onError("Login Error")
        }
    }

}