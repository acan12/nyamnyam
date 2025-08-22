package com.pigeon.demo.domain.repo.headline

import app.coconut2.coconut2_mvvm.network.ApiState
import com.pigeon.demo.data.remote.source.response.TopHeadlineResponse
import kotlinx.coroutines.flow.Flow

interface IHeadlineRepository {
    suspend fun getSourcegetHeadlineDataAsync(): Flow<ApiState<TopHeadlineResponse>>
}