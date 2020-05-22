package com.example.codingchallenge.repository.online

import com.example.codingchallenge.BASE_URL
import com.example.codingchallenge.repository.online.model.Hereos
import retrofit2.http.GET
import retrofit2.http.Path

interface SuperHeroClient {

    @GET("raw/2ee8bd47703c62c5d217d9fb9e0306922a34e581/{endPoint}")
    suspend fun getHereos(
        @Path("endPoint") endPoint : String
    ) : Hereos
}