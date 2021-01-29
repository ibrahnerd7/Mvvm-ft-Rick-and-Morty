package com.ricknmorty.ui.characters

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.ricknmorty.data.repository.CharacterRepository

/**
 * Created by Ibrah on 1/29/21.
 */
class CharactersViewModel @ViewModelInject constructor(
    private val respository: CharacterRepository
) : ViewModel() {
    val characters = respository.getCharacters()
}