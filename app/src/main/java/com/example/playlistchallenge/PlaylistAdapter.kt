package com.example.playlistchallenge

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playlistchallenge.databinding.ItemMusicBinding

class PlaylistAdapter(
    private val list: List<Music>,
    private val onItemClicked: (Music) -> Unit
) : RecyclerView.Adapter<PlaylistViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val binding = ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlaylistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        val music = list[position]
        holder.bind(music)
        holder.itemView.setOnClickListener {
            onItemClicked(music)
        }
    }

    override fun getItemCount(): Int = list.size
}

class PlaylistViewHolder(
    private val binding: ItemMusicBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(music: Music) {
        with(binding) {
            ivItemAlbum.setImageResource(music.image)
            tvMusicName.text = music.name
            tvArtistName.text = music.artist
            tvDuration.text = music.duration
        }
    }
}