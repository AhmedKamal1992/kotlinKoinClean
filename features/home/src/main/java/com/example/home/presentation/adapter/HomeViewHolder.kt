package com.example.home.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.home.databinding.ItemHomeBinding
import com.example.home.presentation.HomeViewModel
import com.example.model.User

class HomeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHomeBinding.bind(view)

    fun bind(user: User, viewModel: HomeViewModel) {
        binding.user = user
        binding.viewmodel = viewModel
    }

}