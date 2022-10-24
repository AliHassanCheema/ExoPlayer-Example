package com.example.exoplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.StyledPlayerView

class MainActivity : AppCompatActivity() {
    private lateinit var player : ExoPlayer
    private lateinit var playerView: StyledPlayerView
    private val videoURL =
        "https://media.geeksforgeeks.org/wp-content/uploads/20201217163353/Screenrecorder-2020-12-17-16-32-03-350.mp4"
    private val mediaItem: MediaItem = MediaItem.fromUri(videoURL)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        player =  ExoPlayer.Builder(this).build()
        playerView = findViewById(R.id.idExoPlayerVIew)
        player.setMediaItem(mediaItem)
        playerView.player = player
        player.prepare()
        player.play()


    }
}