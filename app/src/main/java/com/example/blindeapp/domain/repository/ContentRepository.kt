package com.example.blindeapp.domain.repository

import com.example.blindeapp.domain.model.Content
import kotlinx.coroutines.flow.Flow

interface ContentRepository {

    fun loadList() : Flow<List<Content>>
    suspend fun save(item: Content) : Boolean

    suspend fun update(item: Content) : Boolean

    suspend fun delete(item: Content) : Boolean
}