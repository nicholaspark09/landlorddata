package com.atlantaai.landlord.data

data class Address(
    val streetAddress: String? = null,
    val zipCode: Int? = null,
    val city: String? = null,
    val state: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null
)