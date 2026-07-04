package com.arifali.arifdroid

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Feature 1: QR Scanner
        findViewById<CardView>(R.id.card_qr).setOnClickListener {
            Toast.makeText(this, "📷 QR Scanner Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 2: Flashlight
        findViewById<CardView>(R.id.card_flashlight).setOnClickListener {
            Toast.makeText(this, "🔦 Flashlight On!", Toast.LENGTH_SHORT).show()
        }

        // Feature 3: Cache Cleaner
        findViewById<CardView>(R.id.card_cleaner).setOnClickListener {
            Toast.makeText(this, "🧹 Cleaning Cache...", Toast.LENGTH_SHORT).show()
        }

        // Feature 4: App Blocker
        findViewById<CardView>(R.id.card_blocker).setOnClickListener {
            Toast.makeText(this, "🔒 App Blocker Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 5: Battery Info
        findViewById<CardView>(R.id.card_battery).setOnClickListener {
            Toast.makeText(this, "🔋 Battery: 85%", Toast.LENGTH_SHORT).show()
        }

        // Feature 6: URL Cleaner
        findViewById<CardView>(R.id.card_url).setOnClickListener {
            Toast.makeText(this, "🔗 URL Cleaner Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 7: Screen Recorder
        findViewById<CardView>(R.id.card_recorder).setOnClickListener {
            Toast.makeText(this, "🎥 Screen Recording...", Toast.LENGTH_SHORT).show()
        }

        // Feature 8: Notes
        findViewById<CardView>(R.id.card_notes).setOnClickListener {
            Toast.makeText(this, "📝 Notes Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 9: Calculator
        findViewById<CardView>(R.id.card_calculator).setOnClickListener {
            Toast.makeText(this, "🧮 Calculator Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 10: Unit Converter
        findViewById<CardView>(R.id.card_converter).setOnClickListener {
            Toast.makeText(this, "📏 Unit Converter Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 11: Weather
        findViewById<CardView>(R.id.card_weather).setOnClickListener {
            Toast.makeText(this, "🌤️ Weather Fetching...", Toast.LENGTH_SHORT).show()
        }

        // Feature 12: Compass
        findViewById<CardView>(R.id.card_compass).setOnClickListener {
            Toast.makeText(this, "🧭 Compass Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 13: Speed Test
        findViewById<CardView>(R.id.card_speed).setOnClickListener {
            Toast.makeText(this, "🚀 Speed Test Starting...", Toast.LENGTH_SHORT).show()
        }

        // Feature 14: Password Generator
        findViewById<CardView>(R.id.card_password).setOnClickListener {
            Toast.makeText(this, "🔑 Password: Arif@2026", Toast.LENGTH_SHORT).show()
        }

        // Feature 15: Stopwatch
        findViewById<CardView>(R.id.card_stopwatch).setOnClickListener {
            Toast.makeText(this, "⏱️ Stopwatch Starting...", Toast.LENGTH_SHORT).show()
        }

        // Feature 16: QR Generator
        findViewById<CardView>(R.id.card_qr_gen).setOnClickListener {
            Toast.makeText(this, "📲 QR Generator Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 17: Text to Speech
        findViewById<CardView>(R.id.card_tts).setOnClickListener {
            Toast.makeText(this, "🗣️ Speak Now!", Toast.LENGTH_SHORT).show()
        }

        // Feature 18: Color Picker
        findViewById<CardView>(R.id.card_color).setOnClickListener {
            Toast.makeText(this, "🎨 Color Picker Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 19: Level Tool
        findViewById<CardView>(R.id.card_level).setOnClickListener {
            Toast.makeText(this, "📐 Level Tool Opening...", Toast.LENGTH_SHORT).show()
        }

        // Feature 20: SOS Alert
        findViewById<CardView>(R.id.card_sos).setOnClickListener {
            Toast.makeText(this, "🆘 SOS Alert Sent!", Toast.LENGTH_SHORT).show()
        }

        // Donation Button
        findViewById<CardView>(R.id.card_donate).setOnClickListener {
            val url = "https://buymeacoffee.com/arifali"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}