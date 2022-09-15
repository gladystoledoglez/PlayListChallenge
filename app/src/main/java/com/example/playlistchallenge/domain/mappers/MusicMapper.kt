package com.example.playlistchallenge.domain.mappers

import com.example.playlistchallenge.data.entities.Music
import com.example.playlistchallenge.domain.models.MusicModel

fun Music.toModel() = MusicModel(
    image = image,
    name = name,
    artist = artist,
    duration = duration
)