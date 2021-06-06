package com.dev.network.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

private const val TIME_OUT: Long = 30

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Provides
    fun provideFCOKHttpAuth(): OkHttpClient.Builder {
        return OkHttpClient.Builder()
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
            .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
//            .addInterceptor(
//                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
//                )
    }
}