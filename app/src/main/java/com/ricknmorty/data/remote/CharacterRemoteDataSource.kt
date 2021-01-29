package com.ricknmorty.data.remote

import javax.inject.Inject

/**
 * Created by Ibrah on 1/29/21.
 */
class CharacterRemoteDataSource @Inject constructor(private val characterService: CharacterService) :
    BaseDataSource() {
    suspend fun getCharacters() = getResult { characterService.getAllCharacters() }
    suspend fun getCharacterById(id: Int) = getResult { characterService.getCharacter(id) }
}