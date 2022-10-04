package com.example.madpractical5_20012021030
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var play: FloatingActionButton
    private lateinit var stop: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        play = findViewById(R.id.btn_play)
        play.setOnClickListener{
            play()
        }
        stop = findViewById(R.id.btn_stop)
        stop.setOnClickListener{
            stop()
        }
    }

    private fun play(){
        Intent(applicationContext,MyService::class.java).putExtra(
            MyService.DATA_KEY,MyService.DATA_VALUE).apply { startService(this) }
    }
    private fun stop(){
        Intent(applicationContext,MyService::class.java).apply { stopService(this) }
    }
}
