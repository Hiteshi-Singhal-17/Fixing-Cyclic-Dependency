package com.example.fixcyclicdependency

import android.app.Application
import com.example.user.UserManager
import com.example.order.OrderProcessor

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        setupApplication()
    }

    private fun setupApplication() {
        val userManager = UserManager()
        val orderProcessor = OrderProcessor(userManager)
        // Use `orderProcessor` to process orders in the app
    }
}
