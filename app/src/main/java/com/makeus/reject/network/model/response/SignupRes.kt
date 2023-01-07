package com.makeus.reject.network.model.response

import com.google.gson.annotations.SerializedName

data class SignupRes(
    @SerializedName("isSuccess")
    val isSuccess: String,
    @SerializedName("code")
    val code: String,
    @SerializedName("message")
    val message: String
)