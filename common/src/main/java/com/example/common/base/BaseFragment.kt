package com.example.common.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.common.extension.setupSnackbar
import com.example.navigation.NavigationCommand
import com.google.android.material.snackbar.Snackbar

abstract class BaseFragment: Fragment() {

    abstract fun getViewModel(): BaseViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        observeNavigation(getViewModel())
        setupSnackbar(this, getViewModel().snackBarError, Snackbar.LENGTH_LONG)
    }

    private fun observeNavigation(viewModel: BaseViewModel) {
        viewModel.navigation.observe(viewLifecycleOwner, Observer {
            it?.getContentIfNotHandled()?.let { command ->
                when(command) {
                    is NavigationCommand.To -> { findNavController().navigate(command.directions, getExtras()) }
                    is NavigationCommand.Back -> { findNavController().navigateUp() }
                }
            }
        })
    }

    open fun getExtras(): FragmentNavigator.Extras = FragmentNavigatorExtras()
}