package com.example.blindeapp.presenter.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.blindeapp.databinding.ItemContentBinding
import com.example.blindeapp.domain.model.Content
import com.example.blindeapp.presenter.ui.MainActivity
import com.example.blindeapp.presenter.ui.list.viewholder.ContentViewHolder

class ListAdapter(private val handler: MainActivity.Handler) : ListAdapter<Content, ContentViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        return ContentViewHolder(
            ItemContentBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            handler
        )
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<Content>() {
            override fun areItemsTheSame(oldItem: Content, newItem: Content): Boolean =
                oldItem.id == newItem.id


            override fun areContentsTheSame(oldItem: Content, newItem: Content): Boolean =
                oldItem == newItem
        }
    }
}