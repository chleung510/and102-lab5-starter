package com.codepath.articlesearch

import android.app.Application

// Base class to creating the database
class ArticleApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}
