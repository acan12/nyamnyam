package com.beelabs.nyamnyam.data.sources.remote

import com.beelabs.nyamnyam.data.sources.remote.response.TopHeadlineResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.HeaderMap

interface ApiService {

    @GET("top-headlines/sources?apiKey=6d362365d5e245faa1fe3253c83c45ac")
    suspend fun getTopHeadlines(@HeaderMap header: Map<String, String>): Response<TopHeadlineResponse>

}