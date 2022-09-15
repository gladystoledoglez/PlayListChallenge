package com.example.playlistchallenge.presenter.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.playlistchallenge.domain.models.MusicModel
import com.example.playlistchallenge.presenter.viewHolders.PlaylistViewHolder

class PlaylistAdapter(
    private val onItemClicked: (MusicModel) -> Unit
) : ListAdapter<MusicModel, PlaylistViewHolder>(MusicModel.DIFF_UTIL_CALLBACK) {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = PlaylistViewHolder.newInstance(parent, onItemClicked)

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bind(music = currentList[position])
    }
}