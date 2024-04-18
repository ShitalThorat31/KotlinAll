//package com.shital.kotlinall.MVVMHilt_Main
//
//import android.content.Context
//import androidx.room.Room
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.qualifiers.ApplicationContext
//import dagger.hilt.components.SingletonComponent
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import javax.inject.Singleton
//
//@InstallIn(SingletonComponent::class)
//@Module
//class EntryModule {
//    @Singleton
//    @Provides
//    fun getInstance(): Retrofit {
//
//        return Retrofit.Builder()
//            .baseUrl(RetrofitHelper1.BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//    @Singleton
//    @Provides
//    fun providesEntryService(retrofit: Retrofit) : EntryService1{
//        return retrofit.create(EntryService1::class.java)
//    }
//
//    @Singleton
//    @Provides
//    fun provideFakerDB(@ApplicationContext context : Context) : EntryDatabase1{
//        return Room.databaseBuilder(context, EntryDatabase1::class.java, "FakerDB").build()
//    }
//}