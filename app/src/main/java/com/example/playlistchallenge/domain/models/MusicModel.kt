package com.example.playlistchallenge.domain.models

import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.DiffUtil

data class MusicModel(
    @DrawableRes val image: Int, val name: String, val artist: String, val duration: String
) {
    companion object {
        val DIFF_UTIL_CALLBACK = object : DiffUtil.ItemCallback<MusicModel>() {
            override fun areItemsTheSame(oldItem: MusicModel, newItem: MusicModel): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: MusicModel, newItem: MusicModel): Boolean {
                return oldItem == newItem
            }
        }
    }
}