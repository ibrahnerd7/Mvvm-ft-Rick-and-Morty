package com.ricknmorty.data.repository

import com.ricknmorty.data.local.CharacterDao
import com.ricknmorty.data.remote.CharacterRemoteDataSource
import com.ricknmorty.utils.performGetOperation
import javax.inject.Inject

/**
 * Created by Ibrah on 1/29/21.
 */
class CharacterRepository @Inject constructor(
    private val remoteDataSource: CharacterRemoteDataSource,
    private val localDataSource: CharacterDao
) {
    fun getCharacter(id: Int) = performGetOperation(
        databaseQuery = { localDataSource.getCharacter(id) },
        networkCall = { remoteDataSource.getCharacterById(id) },
        saveCallResult = { localDataSource.insert(it) }
    )

    fun getCharacters() = performGetOperation(
        databaseQuery = { localDataSource.getAllCharacters() },
        networkCall = { remoteDataSource.getCharacters() },
        saveCallResult = { localDataSource.insertAll(it.results) }
    )
}