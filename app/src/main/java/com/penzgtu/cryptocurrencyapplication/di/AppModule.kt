package com.penzgtu.cryptocurrencyapplication.di

import com.penzgtu.cryptocurrencyapplication.common.Constants
import com.penzgtu.cryptocurrencyapplication.data.remote.CoinMarketCapApi
import com.penzgtu.cryptocurrencyapplication.data.remote.dto.CoinDto
import com.penzgtu.cryptocurrencyapplication.data.repository.CoinRepositoryImpl
import com.penzgtu.cryptocurrencyapplication.domain.repository.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun create(): CoinMarketCapApi {
//        val httpLoginInterceptor = HttpLoggingInterceptor()
//        httpLoginInterceptor.level = HttpLoggingInterceptor.Level.BODY
//        val okHttpClient = OkHttpClient.Builder()
//            .addInterceptor(httpLoginInterceptor)
//            .build()


        val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
        return retrofit.create(CoinMarketCapApi::class.java)
    }


    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinMarketCapApi): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}
