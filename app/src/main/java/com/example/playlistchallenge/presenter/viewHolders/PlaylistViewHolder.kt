package com.example.playlistchallenge.presenter.viewHolders

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playlistchallenge.databinding.ItemMusicBinding
import com.example.playlistchallenge.domain.models.MusicModel
import com.example.playlistchallenge.extensions.toLayoutInflater

class PlaylistViewHolder(
    private val binding: ItemMusicBinding,
    private val onItemClicked: (MusicModel) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(music: MusicModel) {
        with(binding) {
            ivItemAlbum.setImageResource(music.image)
            tvMusicName.text = music.name
            tvArtistName.text = music.artist
            tvDuration.text = music.duration
            itemView.setOnClickListener { onItemClicked(music) }
        }
    }

    companion object {
        fun newInstance(
            parent: ViewGroup, onItemClicked: (MusicModel) -> Unit
        ) = PlaylistViewHolder(
            binding = ItemMusicBinding.inflate(parent.context.toLayoutInflater(), parent, false),
            onItemClicked = onItemClicked
        )
    }
}