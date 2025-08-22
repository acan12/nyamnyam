package com.pigeon.demo.data.remote.source

import com.pigeon.demo.data.remote.source.response.TopHeadlineResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.HeaderMap

interface ApiService {

    @GET("top-headlines/sources?apiKey=6d362365d5e245faa1fe3253c83c45ac")
    suspend fun getTopHeadlines(@HeaderMap header: Map<String, String>): Response<TopHeadlineResponse>

}