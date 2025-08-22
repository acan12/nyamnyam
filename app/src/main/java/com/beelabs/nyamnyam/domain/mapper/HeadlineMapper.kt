package com.pigeon.demo.domain.mapper

import com.pigeon.demo.data.remote.source.response.DataResponse


fun DataResponse.toHeadlineData(): HeadlineData =
    HeadlineData(
        name = name.toString(),
        description = description.toString(),
        url = url.toString(),
    )

data class HeadlineData(
    val name: String,
    val description: String,
    val url: String,
)