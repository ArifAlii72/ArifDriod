package com.arifdroid.ultimate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.arifdroid.ultimate.theme.ArifDroidUltimateTheme
import com.arifdroid.ultimate.ui.MainLayout
import com.arifdroid.ultimate.viewmodel.MainViewModel

/**
 * Developed by: Arif Ali
 * GitHub: github.com/ArifAlii72/ArifDroid
 * ArifDroid Ultimate - Glassmorphic Modular Toolbox
 */
class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArifDroidUltimateTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainLayout(viewModel = viewModel)
                }
            }
        }
    }
}