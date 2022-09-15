package com.example.playlistchallenge.data.repositories

import com.example.playlistchallenge.R
import com.example.playlistchallenge.data.entities.Music

class PlaylistRemoteDataSourceImpl {
    fun loadItems() = listOf(
        Music(
            image = R.drawable.ateez_treasure,
            name = "Treasure",
            artist = "ATEEZ",
            duration = "3:41"
        ),
        Music(
            image = R.drawable.blackpink_forever_young,
            name = "Forever Young",
            artist = "BLACKPINK",
            duration = "3:59"
        ),
        Music(
            image = R.drawable.bts_dynamite,
            name = "Dynamite",
            artist = "BTS",
            duration = "3:19"
        ),
        Music(
            image = R.drawable.g_idle_hwa,
            name = "Hwa",
            artist = "(G)I-DLE",
            duration = "3:17"
        ),
        Music(
            image = R.drawable.itzy_wannabe,
            name = "Wannabe",
            artist = "ITZY",
            duration = "3:11"
        ),
        Music(
            image = R.drawable.kard_red_moon,
            name = "Red Moon",
            artist = "K.A.R.D",
            duration = "2:52"
        ),
        Music(
            image = R.drawable.mx_wanted,
            name = "Wanted",
            artist = "MONSTA X",
            duration = "3:33"
        ),
        Music(
            image = R.drawable.nct_regular,
            name = "Regular",
            artist = "NCT 127",
            duration = "3:39"
        ),
        Music(
            image = R.drawable.twice_signal,
            name = "Signal",
            artist = "TWICE",
            duration = "3:17"
        ),
        Music(
            image = R.drawable.wonho_lose,
            name = "Lose",
            artist = "WONHO",
            duration = "3:08"
        )
    )
}