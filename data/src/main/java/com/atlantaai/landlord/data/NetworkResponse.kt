package com.atlantaai.landlord.data

sealed class NetworkResponse {
    data class Success<T>(val data: T) : NetworkResponse()
    data class Error<T>(val error: Throwable? = null, val defaultValue: T? = null): NetworkResponse()
    object Loading : NetworkResponse()
}