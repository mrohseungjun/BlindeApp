package com.example.blindeapp.di

import android.content.Context
import androidx.room.Room
import com.example.blindeapp.data.source.local.AppDatabase
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Singleton
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Singleton
    @Provides
    fun providesDataBase(@ApplicationContext contexxt: Context) : AppDatabase{
        return Room.databaseBuilder(contexxt, AppDatabase::class.java, "blind.db")
            .fallbackToDestructiveMigration()
            .build()
    }
}