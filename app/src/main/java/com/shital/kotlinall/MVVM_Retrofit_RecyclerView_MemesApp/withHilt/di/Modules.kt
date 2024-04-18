package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.di

import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.api.InterfaceJokes_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.constant.RetrofitHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class Modules {
    @Singleton
    @Provides
    fun getInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(RetrofitHelper.BASE__URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesMemes(retrofit_: Retrofit) : InterfaceJokes_ {
        return retrofit_.create(InterfaceJokes_::class.java)
    }


}