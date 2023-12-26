package com.example.blindeapp.data.model.entity.dto

data class ListResponse(
    val success: Boolean,
    val code: Int,
    val message: String,
    val data : List<ContentDto>
)

data class ContentResponse(
    val success: Boolean,
    val code: Int,
    val message: String,
    val data : ContentDto
)