package com.atlantaai.landlord.data

interface Address {
    var id: String?
    val streetAddress: String
    val zipCode: Int
    val city: String
    val state: String
    val latitude: Double
    val longitude: Double
}