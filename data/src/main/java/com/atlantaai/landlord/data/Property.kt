package com.atlantaai.landlord.data

data class Property(
    val id: Long? = null,
    val title: String? = null,
    val description: String? = null,
    val address: Address? = null,
    val rentPerMonth: Double? = null,
    val isAvailable: Boolean = false,
    val nextAvailableDate: String? = null,
    val totalOccupants: Int? = null,
    val bedrooms: Int? = null,
    val bathrooms: Int? = null,
    val thumbnail: String? = null,
    val largeImage: String? = null
)
