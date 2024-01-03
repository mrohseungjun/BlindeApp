package com.example.blindeapp.data.model

import com.example.blindeapp.data.model.entity.ContentEntity
import com.example.blindeapp.data.model.entity.dto.ContentDto
import com.example.blindeapp.domain.model.Content
import java.util.Date

object ContentMapper {
    fun Content.toRequest() = ContentDto(
        id = id,
        title = title,
        content = content,
        category = category,
        likeCount = likeCount,
        commentCount = commentCount,
        viewCount = viewCount
    )

    fun ContentDto.toContent() = Content(
        id = id ?: -1,
        title = title,
        content = content,
        category = category,
        likeCount = likeCount ?: 0,
        viewCount = viewCount ?: 0,
        commentCount = commentCount ?: 0,
        createdDate = createdDate ?: Date()
    )

    fun ContentDto.toEntity() = ContentEntity(
        id = id ?: -1,
        title = title,
        content = content,
        category = category,
        likeCount = likeCount ?: 0,
        commentCount = commentCount ?: 0,
        viewCount = viewCount ?: 0,
        createdDate = createdDate ?: Date(),
    )

    fun Content.toEntity() = ContentEntity(
        id = id ?: -1,
        title = title,
        content = content,
        category = category,
        likeCount = likeCount,
        commentCount = commentCount,
        viewCount = viewCount,
        createdDate = createdDate,
    )

    fun ContentEntity.toContent() = Content(
        id = id,
        title = title,
        content = content,
        category = category,
        viewCount = viewCount,
        commentCount = commentCount,
        likeCount = likeCount,
        createdDate = createdDate
    )
}