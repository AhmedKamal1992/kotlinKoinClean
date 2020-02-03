package com.example.detail.presentation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.navArgs
import com.example.common.base.BaseFragment
import com.example.common.base.BaseViewModel
import com.example.detail.databinding.FragmentDetailsBinding
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class DetailsFragment : BaseFragment() {

    private val viewModel: UserDetailsViewModel by viewModel()
    private lateinit var binding: FragmentDetailsBinding

    private val args: DetailsFragmentArgs by navArgs()

    override fun getViewModel(): BaseViewModel = viewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.loadDataWhenActivityStarts(args.login)
    }


}
