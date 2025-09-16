package com.beelabs.nyamnyam.domain.repo.headline

import app.coconut2.coconut2_mvvm.network.ApiState
import com.beelabs.nyamnyam.data.sources.remote.response.TopHeadlineResponse
import kotlinx.coroutines.flow.Flow

interface IHeadlineRepository {
    suspend fun getSourcegetHeadlineDataAsync(): Flow<ApiState<TopHeadlineResponse>>
}