package com.example.mvvmdemoapplication.Data.Api

import com.example.mvvmdemoapplication.Data.Model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}