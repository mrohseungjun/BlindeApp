package com.example.blindeapp.di

import com.example.blindeapp.data.repository.ContentRepositoryImpl
import com.example.blindeapp.data.source.local.dao.ContentDao
import com.example.blindeapp.data.source.remote.api.ContentService
import com.example.blindeapp.domain.repository.ContentRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun providesContentRepository(
        contentService: ContentService,
        contentDao: ContentDao
    ): ContentRepository = ContentRepositoryImpl(contentService, contentDao)
}