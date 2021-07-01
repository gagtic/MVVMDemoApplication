package com.example.mvvmdemoapplication.Data.Api

class ApiHelper(private val apiService: ApiService) {
    fun getUsers() = apiService.getUsers()
}