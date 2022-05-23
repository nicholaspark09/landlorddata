package com.atlantaai.landlord.data

interface Property {
    val id: Long? 
    val title: String? 
    val description: String? 
    val address: Address? 
    val rentPerMonth: Double? 
    val isAvailable: Boolean
    val nextAvailableDate: String? 
    val totalOccupants: Int? 
    val bedrooms: Int? 
    val bathrooms: Int? 
    val thumbnail: String? 
    val largeImage: String? 
    val latitude: Double? 
    val longitude: Double? 
    val geohash: String?
}
