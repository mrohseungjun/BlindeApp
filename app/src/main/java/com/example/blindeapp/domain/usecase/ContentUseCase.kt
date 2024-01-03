package com.example.blindeapp.domain.usecase

import com.example.blindeapp.domain.model.Content
import com.example.blindeapp.domain.repository.ContentRepository
import javax.inject.Inject

class ContentUseCase @Inject constructor(private val contentRepository: ContentRepository) {

    fun loadList() = contentRepository.loadList()
    suspend fun save(item:Content) = contentRepository.save(item)

    suspend fun delete(item: Content) = contentRepository.delete(item)
}