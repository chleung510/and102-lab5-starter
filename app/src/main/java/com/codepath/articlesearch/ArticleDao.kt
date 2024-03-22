package com.codepath.articlesearch

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


    @Dao
    interface ArticleDao {
        // Get all the entries in the database
        @Query("SELECT * FROM article_table")
        fun getAll(): Flow<List<ArticleEntity>>

        // Insert all the articles to the database
        @Insert
        fun insertAll(articles: List<ArticleEntity>)

        // Delete all the entries on the database
        @Query("DELETE FROM article_table")
        fun deleteAll()
    }

