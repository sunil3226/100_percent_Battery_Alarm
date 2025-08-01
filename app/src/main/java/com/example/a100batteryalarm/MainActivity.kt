package com.example.a100batteryalarm

import android.content.Intent
import android.content.IntentFilter
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.net.Uri
import android.os.*
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var batteryLevelText: TextView
    private lateinit var stopButton: Button

    private var mediaPlayer: MediaPlayer? = null
    private var vibrator: Vibrator? = null
    private lateinit var batteryReceiver: BatteryBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        batteryLevelText = findViewById(R.id.battery_level)
        stopButton = findViewById(R.id.stopButton)
        vibrator = getSystemService(VIBRATOR_SERVICE) as Vibrator

        stopButton.setOnClickListener {
            stopAlert()
        }

        // Initialize and register the broadcast receiver
        batteryReceiver = BatteryBroadcastReceiver { batteryPct, isCharging, chargingType ->
            val chargingStatus = if (isCharging) chargingType else "Not Charging"
            batteryLevelText.text = "Battery Level: $batteryPct%\nStatus: $chargingStatus"

            if (batteryPct == 100 && isCharging) {
                startAlert()
            } else {
                stopAlert()
            }
        }

        registerReceiver(batteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }

    private fun startAlert() {
        if (mediaPlayer == null) {
            val ringtoneUri: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE)
            mediaPlayer = MediaPlayer.create(applicationContext, ringtoneUri)?.apply {
                isLooping = true
                start()
            }
        }

        vibrate()
        stopButton.visibility = View.VISIBLE
    }

    private fun vibrate() {
        val pattern = longArrayOf(0, 1000, 1000)
        vibrator?.let {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                it.vibrate(VibrationEffect.createWaveform(pattern, 0))
            } else {
                it.vibrate(pattern, 0)
            }
        }
    }

    private fun stopAlert() {
        mediaPlayer?.apply {
            stop()
            release()
        }
        mediaPlayer = null
        vibrator?.cancel()
        stopButton.visibility = View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(batteryReceiver)
        stopAlert()
    }
}
