package com.atlantaai.landlord.data

interface Property {
    var id: String?
    var title: String? 
    var description: String? 
    var address: Address? 
    var rentPerMonth: Double? 
    var isAvailable: Boolean
    var nextAvailableDate: String? 
    var totalOccupants: Int? 
    var bedrooms: Int? 
    var bathrooms: Int? 
    var thumbnail: String? 
    var largeImage: String? 
    var latitude: Double? 
    var longitude: Double? 
    var geohash: String?
}
