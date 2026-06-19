package com.nannan.nansu.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import com.nannan.nansu.ui.LocalUiMode
import com.nannan.nansu.ui.UiMode

@Composable
fun UninstallDialog(
    show: Boolean,
    onDismissRequest: () -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(show, onDismissRequest)
        UiMode.Material -> UninstallDialogMaterial(show, onDismissRequest)
    }
}
