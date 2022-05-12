package com.atlantaai.landlord.data.api

import com.atlantaai.landlord.data.Property

data class ResponsePropertyQuery(
    val results: List<Property>,
    val totalCount: Int
)