package com.arifali.arifdroid

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // QR Scanner
        findViewById<Button>(R.id.btn_qr).setOnClickListener {
            Toast.makeText(this, "📷 QR Scanner Opening...", Toast.LENGTH_SHORT).show()
        }

        // Flashlight
        findViewById<Button>(R.id.btn_flash).setOnClickListener {
            Toast.makeText(this, "🔦 Flashlight On!", Toast.LENGTH_SHORT).show()
        }

        // Cache Cleaner
        findViewById<Button>(R.id.btn_clean).setOnClickListener {
            Toast.makeText(this, "🧹 Cache Cleaned!", Toast.LENGTH_SHORT).show()
        }

        // Donation
        findViewById<Button>(R.id.btn_donate).setOnClickListener {
            val url = "https://buymeacoffee.com/arifali"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}