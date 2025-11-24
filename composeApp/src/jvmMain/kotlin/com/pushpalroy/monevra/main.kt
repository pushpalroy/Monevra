package com.pushpalroy.monevra

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Monevra",
    ) {
        App()
    }
}