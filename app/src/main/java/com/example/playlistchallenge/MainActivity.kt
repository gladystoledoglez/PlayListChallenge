package com.example.playlistchallenge

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.playlistchallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = PlaylistAdapter(PlaylistData().loadItems()) { music ->
            Toast.makeText(this, "${music.name} clicked", Toast.LENGTH_SHORT).show()
        }
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rvMusicList.apply {
            this.adapter = adapter
            this.layoutManager = layoutManager
        }
    }
}