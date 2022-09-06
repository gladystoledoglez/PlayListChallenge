package com.example.playlistchallenge

import androidx.annotation.DrawableRes

data class Music(
    @DrawableRes val image: Int, val name: String, val artist: String, val duration: String
)
