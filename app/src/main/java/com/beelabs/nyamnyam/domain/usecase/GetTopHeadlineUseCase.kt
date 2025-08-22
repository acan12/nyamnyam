package com.pigeon.demo.domain.usecase

import app.coconut2.coconut2_mvvm.network.ApiState
import com.pigeon.demo.data.remote.source.response.TopHeadlineResponse
import com.pigeon.demo.domain.repo.headline.IHeadlineRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTopHeadlineUseCase @Inject constructor
    (private val repository: IHeadlineRepository) {
    suspend operator fun invoke(): Flow<ApiState<TopHeadlineResponse>> =
        repository.getSourcegetHeadlineDataAsync()
}