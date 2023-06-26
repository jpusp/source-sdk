package com.example.analytics.ui

interface AnalyticsProvider {

    fun sendEvent(data: Map<String, Any>)
}