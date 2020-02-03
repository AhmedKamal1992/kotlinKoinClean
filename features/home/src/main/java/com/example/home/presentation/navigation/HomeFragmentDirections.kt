package com.example.home.presentation.navigation

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.home.R

class HomeFragmentDirections private constructor() {

    private data class ActionHomeFragmentToDetailsFragment(val login: String): NavDirections {

        override fun getActionId(): Int = R.id.action_homeFragment_to_detailsFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("login", login)
            return result
        }
    }

    companion object {
        fun actionHomeFragmentToDetailsFragment(login: String): NavDirections =
            ActionHomeFragmentToDetailsFragment(login)

    }
}