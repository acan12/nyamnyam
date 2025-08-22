package com.pigeon.demo.data.remote.repo

import app.coconut2.coconut2_mvvm.base.BaseRepository
import com.pigeon.demo.data.remote.source.Api
import com.pigeon.demo.domain.repo.headline.IHeadlineRepository
import javax.inject.Inject

class HeadlineRepository @Inject constructor(
    private val api: Api,
) : BaseRepository(), IHeadlineRepository {

    override suspend fun getSourcegetHeadlineDataAsync() =
        safeApiCall(
            apiCall = {
                // define api call
                api.getDomainNetwork().getTopHeadlines(api.initHeader())
            },
            saveResponse = { response ->
                // callback responses in asynchronous process from api
//                topHeadlineLocalData.save(response, DataType.JSON)
//                topHeadlineLocalData.get().collect {
//                    val data = it
//                    Log.d("TAG", data.sources.size.toString())
//                }
            },
        )
}