package com.atlantaai.landlord.data.api

interface PropertyQuery {
    val geohash: String?
    val street: String?
    val city: String?
    val state: String?
    val zip: String?
    val latitude: Double?
    val longitude: Double?
    val limit: Int
}