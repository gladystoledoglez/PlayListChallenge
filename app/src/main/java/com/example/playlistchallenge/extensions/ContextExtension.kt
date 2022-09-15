package com.example.playlistchallenge.extensions

import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast

fun Context?.toLayoutInflater(): LayoutInflater = LayoutInflater.from(this)

fun Context?.showText(text: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, length).show()
}