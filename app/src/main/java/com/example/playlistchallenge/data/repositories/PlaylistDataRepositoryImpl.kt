package com.example.playlistchallenge.data.repositories

import com.example.playlistchallenge.domain.mappers.toModel
import com.example.playlistchallenge.domain.repository.PlaylistRepository

class PlaylistDataRepositoryImpl(
    private val remoteDataSource: PlaylistRemoteDataSourceImpl
) : PlaylistRepository {

    override fun loadItems() = remoteDataSource.loadItems().map { it.toModel() }
}