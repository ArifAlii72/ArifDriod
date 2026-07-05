package com.arifdroid.ultimate.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arifdroid.ultimate.theme.DarkBackground
import com.arifdroid.ultimate.theme.PrimaryColor
import com.arifdroid.ultimate.viewmodel.MainViewModel

@Composable
fun MainLayout(viewModel: MainViewModel) {
    val currentTab by viewModel.currentTab.collectAsState()
    val isLocked by viewModel.isAppLocked.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        DarkBackground,
                        DarkBackground.copy(alpha = 0.85f),
                        PrimaryColor.copy(alpha = 0.15f)
                    )
                )
            )
    ) {
        if (isLocked) {
            AppLockScreen(onUnlock = { viewModel.setAppLock(false) })
        } else {
            Column(modifier = Modifier.fillMaxSize()) {
                // Custom Frosted Header
                HeaderSection()

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    when (currentTab) {
                        0 -> DashboardScreen(viewModel)
                        1 -> ToolsScreen(viewModel)
                        2 -> MediaScreen(viewModel)
                        3 -> ThemesScreen()
                        4 -> AboutSettingsScreen(viewModel)
                    }
                }

                // Beautiful Glass Bottom Navigation
                BottomNavBar(currentTab = currentTab, onTabSelected = { viewModel.selectTab(it) })
            }
        }
    }
}

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "ArifDroid Ultimate",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "Developed by Arif Ali",
                fontSize = 12.sp,
                color = Color.White.copy(alpha = 0.6f)
            )
        }
        
        // Premium Badge
        Box(
            modifier = Modifier
                .background(Color(0x33FFFFFF), RoundedCornerShape(12.dp))
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Text(
                text = "PRO",
                color = PrimaryColor,
                fontWeight = FontWeight.Bold,
                fontSize = 11.sp
            )
        }
    }
}

@Composable
fun BottomNavBar(currentTab: Int, onTabSelected: (Int) -> Unit) {
    // Glass Bottom Navigation Bar implementation...
}