package com.atlantaai.landlord.data

sealed class NetworkResponse<T>{
    data class Success<T>(val data: T) : NetworkResponse<T>()
    data class Error<T>(val error: Throwable? = null, val defaultValue: T? = null): NetworkResponse<T>()
    class Loading<T> : NetworkResponse<T>()
}