package com.moktar.mvpkotlin

interface VideoProgressCallback {

    fun onProgressUpdate(position: Int, duration: Int)
}