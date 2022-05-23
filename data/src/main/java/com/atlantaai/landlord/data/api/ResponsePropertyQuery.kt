package com.atlantaai.landlord.data.api

import com.atlantaai.landlord.data.Property

interface ResponsePropertyQuery {
    val results: List<Property>
    val totalCount: Int
}