package com.example.order

import com.example.common.UserProvider

class OrderProcessor(private val userProvider: UserProvider) {
    fun processOrder(productId: Int) {
        val user = userProvider.getUser()
        // Process the order with user information
    }
}
