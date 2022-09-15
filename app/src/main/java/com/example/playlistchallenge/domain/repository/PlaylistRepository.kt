package com.example.playlistchallenge.domain.repository

import com.example.playlistchallenge.domain.models.MusicModel

interface PlaylistRepository {
    fun loadItems(): List<MusicModel>
}