package com.example.user

import com.example.common.UserProvider
import com.example.common.User

class UserManager : UserProvider {
    override fun getUser(): User {
        // Return the user information
        return User("1234","HS")
    }
}
