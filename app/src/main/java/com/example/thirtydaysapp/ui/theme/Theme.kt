package com.example.thirtydaysapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = LavenderPrimary,
    onPrimary = LavenderOnPrimary,
    secondary = LavenderSecondary,
    onSecondary = LavenderOnSecondary,
    tertiary = LavenderTertiary,
    onTertiary = LavenderOnTertiary,
    background = LavenderBackground,
    onBackground = LavenderOnBackground,
    surface = LavenderSurface,
    onSurface = LavenderOnSurface
)

private val DarkColors = darkColorScheme(
    primary = LavenderPrimaryDark,
    onPrimary = LavenderOnPrimaryDark,
    secondary = LavenderSecondaryDark,
    onSecondary = LavenderOnSecondaryDark,
    tertiary = LavenderTertiaryDark,
    onTertiary = LavenderOnTertiaryDark,
    background = LavenderBackgroundDark,
    onBackground = LavenderOnBackgroundDark,
    surface = LavenderSurfaceDark,
    onSurface = LavenderOnSurfaceDark
)

@Composable
fun ThirtyDaysAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}