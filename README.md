![badge-jvm](http://img.shields.io/badge/platform-jvm-DB413D.svg?style=flat)

# javafx-components

Project provides to create components and useful functions.

## [Notifications](src/main/kotlin/com/luciusgen/components/notifications/NotificationsRunCatching.kt)

The NotificationsRunCatching function in the javafx-components project is a utility function that can be used to run a
task and display notifications for any exceptions that occur. The function takes a Runnable object as its argument,
which represents the task to be run, and an optional title and message for the notification.

If the task runs without any exceptions, the function simply returns. However, if an exception is thrown, the function
displays a notification with the specified title and message, and also prints the exception to the console. This can be
useful for catching and handling exceptions in a user-friendly manner, rather than having the exception crash the
application.

Overall, the NotificationsRunCatching function provides a convenient way to handle exceptions in a user-friendly manner,
making it easier for developers to write reliable and user-friendly applications with JavaFX.

Notification displays controlfx Notificatios.

Use [NotificationsSettings](src/main/kotlin/com/luciusgen/components/notifications/NotificationsSettings.kt) to controls
display settings.

