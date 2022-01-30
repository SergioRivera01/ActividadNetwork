package com.example.actividadnetwork

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    suspend fun getDOgsByBreeds(@Url url : String): Response<DogsResponse>
}