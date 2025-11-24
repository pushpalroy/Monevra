package com.pushpalroy.monevra

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform