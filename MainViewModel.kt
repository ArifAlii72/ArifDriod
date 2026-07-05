package com.arifdroid.ultimate.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    private val _currentTab = MutableStateFlow(0)
    val currentTab: StateFlow<Int> = _currentTab.asStateFlow()

    private val _isFlashlightOn = MutableStateFlow(false)
    val isFlashlightOn: StateFlow<Boolean> = _isFlashlightOn.asStateFlow()

    private val _isAppLocked = MutableStateFlow(false)
    val isAppLocked: StateFlow<Boolean> = _isAppLocked.asStateFlow()

    private val _heartRate = MutableStateFlow(0)
    val heartRate: StateFlow<Int> = _heartRate.asStateFlow()

    private val _ramUsage = MutableStateFlow(62) // Initial RAM %
    val ramUsage: StateFlow<Int> = _ramUsage.asStateFlow()

    fun selectTab(index: Int) {
        _currentTab.value = index
    }

    fun toggleFlashlight(on: Boolean) {
        _isFlashlightOn.value = on
    }

    fun setAppLock(locked: Boolean) {
        _isAppLocked.value = locked
    }

    fun triggerRamBoost() {
        _ramUsage.value = 35 // Boosted RAM %
    }

    fun updateHeartRate(bpm: Int) {
        _heartRate.value = bpm
    }
}