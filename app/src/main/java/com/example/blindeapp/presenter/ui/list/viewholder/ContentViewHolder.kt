package com.example.blindeapp.presenter.ui.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.blindeapp.databinding.ItemContentBinding
import com.example.blindeapp.domain.model.Content
import com.example.blindeapp.presenter.ui.MainActivity

class ContentViewHolder(
    private val binding: ItemContentBinding,
    private val handler: MainActivity.Handler
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Content) {
        binding.item = item
        binding.handler = handler
    }

}