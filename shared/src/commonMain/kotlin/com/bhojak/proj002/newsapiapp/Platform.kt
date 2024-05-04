package com.bhojak.proj002.newsapiapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform