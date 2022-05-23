package com.atlantaai.landlord.data.api

import com.atlantaai.landlord.data.Property

interface ResponseFetchProperties {
    val results: List<Property>
    val lastKey: String?
    val totalCount: Int
}