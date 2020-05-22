package com.example.codingchallenge.repository.online

import com.example.codingchallenge.repository.online.model.Hereos
import java.io.StringReader
import javax.inject.Inject

class SuperHeroRepository @Inject constructor(private val superHeroClient: SuperHeroClient) {

    suspend fun getSuperHeroStatistics( year : String) : Hereos = superHeroClient.getHereos(year)

}