package com.atlantaai.landlord.data

interface Address {
    val streetAddress: String
    val zipCode: Int
    val city: String
    val state: String
    val latitude: Double
    val longitude: Double
}