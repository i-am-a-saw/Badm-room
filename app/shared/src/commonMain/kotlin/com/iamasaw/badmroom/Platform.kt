package com.iamasaw.badmroom

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform