package com.nannan.nansu.ui.viewmodel

import androidx.compose.runtime.Immutable
import com.nannan.nansu.ui.UiMode
import com.nannan.nansu.ui.theme.AppSettings

@Immutable
data class MainActivityUiState(
    val appSettings: AppSettings,
    val pageScale: Float,
    val enableBlur: Boolean,
    val enableFloatingBottomBar: Boolean,
    val enableFloatingBottomBarBlur: Boolean,
    val uiMode: UiMode,
)
