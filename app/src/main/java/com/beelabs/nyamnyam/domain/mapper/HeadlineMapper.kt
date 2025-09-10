package com.pigeon.demo.domain.mapper

import com.beelabs.nyamnyam.data.sources.remote.response.DataResponse


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