package com.example.playlistchallenge.presenter.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.playlistchallenge.data.repositories.PlaylistDataRepositoryImpl
import com.example.playlistchallenge.data.repositories.PlaylistRemoteDataSourceImpl
import com.example.playlistchallenge.domain.mappers.toModel
import com.example.playlistchallenge.domain.models.MusicModel
import com.example.playlistchallenge.domain.repository.PlaylistRepository

internal class PlaylistViewModel(private val repository: PlaylistDataRepositoryImpl) : ViewModel() {
    private val _playlistInfo: MutableLiveData<List<MusicModel>> = MutableLiveData()
    val playlistInfo: LiveData<List<MusicModel>> = _playlistInfo

    fun loadPlayList() {
        val playlist = repository.loadItems()
        _playlistInfo.postValue(playlist)
    }
}