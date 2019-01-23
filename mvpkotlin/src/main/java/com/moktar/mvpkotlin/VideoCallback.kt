package com.moktar.mvpkotlin

/**
 * @author moktar
 */
interface VideoCallback {

    /**
     * Called right after Android MediaPlayer is started
     * @param player
     */
    fun onStarted(player: MVideoPlayer)

    /**
     * Called right after Android MediaPlayer is paused
     * @param player
     */
    fun onPaused(player: MVideoPlayer)

    /**
     * Called just before setting the source of Android MediaPlayer
     * @param player
     */
    fun onPreparing(player: MVideoPlayer)

    /**
     * Called when Android MediaPlayer is prepared
     * @param player
     */
    fun onPrepared(player: MVideoPlayer)

    /**
     * Called whenever Android MediaPlayer fires a BufferUpdate.
     * @param percent
     */
    fun onBuffering(percent: Int)

    /**
     * Exception occurred in the player.
     * @param player
     * @param e
     */
    fun onError(player: MVideoPlayer, e: Exception)

    /**
     * Called after video is completed and every action is taken by the player.
     * @param player
     */
    fun onCompletion(player: MVideoPlayer)

    /**
     * New: Control toggling might be of importance especially when using fullscreen.
     * You might also adjust your layout or overlays according to controls' visibility.
     * This method is called whenever visibility of controls is changed.
     * @param player
     * @param isShowing : True if controls are visible.
     */
    fun onToggleControls(player: MVideoPlayer, isShowing: Boolean)
}