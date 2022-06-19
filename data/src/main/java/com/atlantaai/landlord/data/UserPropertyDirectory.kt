package com.atlantaai.landlord.data

interface UserPropertyDirectory {
    var id: String?
    var propertyId: String?
    var userId: String?
    var isOwner: Boolean
    var isFavorite: Boolean
    var created: String?
    var modified: String?
    var isExpired: Boolean
}