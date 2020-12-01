package com.codepath.bestsellerlistapp.models

import com.google.gson.annotations.SerializedName

class NYTimesAPIResponse {
    @SerializedName("status")
    var status: String? = null

    @SerializedName("results")
    var results: BestSellerResults? = null
}