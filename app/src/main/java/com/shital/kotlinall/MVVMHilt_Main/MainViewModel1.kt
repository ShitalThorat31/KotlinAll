//package com.shital.kotlinall.MVVMHilt_Main
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//@HiltViewModel
//class MainViewModel1 @Inject constructor(val repostory: EntryRepostory1):ViewModel() {
//
//    init {
//
//        viewModelScope.launch (Dispatchers.IO )
//            {
//                repostory.getEntry()
//            }
//        }
//        val etry:LiveData<PublicModel1>
//        get()=repostory.entry
//
//}