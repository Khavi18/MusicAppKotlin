package com.example.musicappkotlin

import androidx.annotation.DrawableRes
import java.util.Collections.list

data class LibraryData(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<LibraryData> (
    LibraryData(R.drawable.twotone_queue_music_24, "Playlist"),
    LibraryData(R.drawable.baseline_mic_24, "Artists"),
    LibraryData(R.drawable.baseline_album_24, "Album"),
    LibraryData(R.drawable.baseline_music_note_24, "Songs"),
    LibraryData(R.drawable.baseline_featured_play_list_24, "Genre"),
)
