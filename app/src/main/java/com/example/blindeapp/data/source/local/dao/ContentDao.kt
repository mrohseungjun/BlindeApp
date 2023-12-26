package com.example.blindeapp.data.source.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.blindeapp.data.model.entity.ContentEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface ContentDao {

    @Query("SELECT * FROM content ORDER BY createdDate DESC")
    fun selectAll(): Flow<List<ContentEntity>>

    @Delete
    suspend fun delete(item: ContentEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: ContentEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<ContentEntity>)
}