package com.example.mvvmdemoapplication.Data.Repository

import com.example.mvvmdemoapplication.Data.Api.ApiHelper
import com.example.mvvmdemoapplication.Data.Model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}