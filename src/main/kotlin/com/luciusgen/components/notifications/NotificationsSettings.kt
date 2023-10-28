package com.luciusgen.components.notifications

object NotificationsSettings {
    var style: NotificationStyle = NotificationStyle.DARK
    var title: String = "Error"
    var displayTime: Double = 5.0
    var displayType = DisplayType.SIMPLE
}

enum class DisplayType {
    SIMPLE, WARNING, ERROR
}

enum class NotificationStyle {
    DARK, LIGHT
}

data class ExceptionWithAdditionalInfo(
    val exceptionClass: Class<*>,
    val message: String
)