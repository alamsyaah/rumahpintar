package com.example.rumahpintar.langganan.model

object Package {

    data class Subscribe(
        var image: String? = null,
        var name: String? = null,
        var users: Int? = null,
        var rate: Double? = null,
        var question: String? = null,
        var price: String? = null
    )
}