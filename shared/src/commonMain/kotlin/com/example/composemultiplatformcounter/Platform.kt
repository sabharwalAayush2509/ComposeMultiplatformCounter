package com.example.composemultiplatformcounter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform