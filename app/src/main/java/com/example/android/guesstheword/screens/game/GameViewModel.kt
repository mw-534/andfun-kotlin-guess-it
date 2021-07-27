package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * ViewModel containing all the logic needed to run the game
 */
class GameViewModel : ViewModel() {

    init {
        Log.i(this::class.java.simpleName, "GameViewModel created!")
    }

    /**
     * This method will be called when this ViewModel is no longer used and will be destroyed.
     *
     *
     * It is useful when ViewModel observes some data and you need to clear this subscription to
     * prevent a leak of this ViewModel.
     */
    override fun onCleared() {
        super.onCleared()
        Log.i(this::class.java.simpleName, "GameViewModel destroyed!")
    }
}