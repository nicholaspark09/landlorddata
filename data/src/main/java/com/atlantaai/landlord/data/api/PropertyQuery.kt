package com.atlantaai.landlord.data.api

data class PropertyQuery(
    val street: String? = null,
    val city: String? = null,
    val state: String? = null,
    val zip: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val limit: Int
)