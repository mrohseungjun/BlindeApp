package com.example.blindeapp.presenter.ui

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blindeapp.databinding.ActivityMainBinding
import com.example.blindeapp.domain.model.Content
import com.example.blindeapp.presenter.ui.list.ListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    private val adapter by lazy {
        ListAdapter(Handler())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            view = this@MainActivity
            recyclerView.adapter = adapter
            recyclerView.addItemDecoration(
                DividerItemDecoration(this@MainActivity, LinearLayout.VERTICAL)
            )
        }

    }

    fun onClickAdd(){

    }

    inner class Handler{
        fun onClickItem(item: Content){

        }

        fun onLongClickItem(item: Content): Boolean{
            AlertDialog.Builder(this@MainActivity)
                .setTitle("정말 삭제 하시겠습니까?")
                .setPositiveButton("네"){ _, _ ->

                }.show()
            return false
        }
    }
}