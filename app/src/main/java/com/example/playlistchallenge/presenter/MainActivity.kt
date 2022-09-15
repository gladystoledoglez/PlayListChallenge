package com.example.playlistchallenge.presenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.playlistchallenge.data.repositories.PlaylistDataRepositoryImpl
import com.example.playlistchallenge.data.repositories.PlaylistRemoteDataSourceImpl
import com.example.playlistchallenge.databinding.ActivityMainBinding
import com.example.playlistchallenge.domain.models.MusicModel
import com.example.playlistchallenge.extensions.showText
import com.example.playlistchallenge.presenter.adapters.PlaylistAdapter
import com.example.playlistchallenge.presenter.viewModels.PlaylistViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter by lazy { PlaylistAdapter(::onMusicClicked) }
    private val viewModel by lazy {
        PlaylistViewModel(PlaylistDataRepositoryImpl(PlaylistRemoteDataSourceImpl()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setObserver()
        binding.rvMusicList.adapter = adapter
    }

    private fun setObserver() {
        with(viewModel) {
            playlistInfo.observe(this@MainActivity) { adapter.submitList(it) }
            loadPlayList()
        }
    }

    private fun onMusicClicked(music: MusicModel) {
        this.showText(text = "${music.name} clicked")
    }
}