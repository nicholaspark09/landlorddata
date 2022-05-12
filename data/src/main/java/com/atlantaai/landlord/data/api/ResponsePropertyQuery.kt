package com.atlantaai.landlord.data.api

data class ResponsePropertyQuery(
    val results: List<PropertyQuery>,
    val totalCount: Int
)