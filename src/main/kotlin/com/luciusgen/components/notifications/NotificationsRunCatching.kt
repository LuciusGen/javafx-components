package com.luciusgen.components.notifications

import javafx.application.Platform
import javafx.util.Duration
import org.controlsfx.control.Notifications

/**
 * use runCatching to run block and show javafx notification with [NotificationsSettings] on failure
 * */
fun <R> runCatchingNotifications(
    block: () -> R,
    exceptions: List<ExceptionWithAdditionalInfo>
): Result<R> {
    return runCatching(block)
        .onFailure { exception ->
            val exceptionWIthMessage = exceptions.find { it.exceptionClass == exception::class.java }

            exceptionWIthMessage?.let {
                Platform.runLater {
                    val builder = Notifications.create()
                    if (NotificationsSettings.style == NotificationStyle.DARK)
                        builder.darkStyle()

                    builder.title(NotificationsSettings.title)
                        .text(it.message)
                        .hideAfter(Duration.seconds(NotificationsSettings.displayTime))
                    if (NotificationsSettings.displayType == DisplayType.SIMPLE)
                        builder.show()
                    if (NotificationsSettings.displayType == DisplayType.WARNING)
                        builder.showWarning()
                    if (NotificationsSettings.displayType == DisplayType.ERROR)
                        builder.showError()
                }
            }
        }
}


