package com.example.response

import com.example.domain.ApiModel

data class ApiResponse ( val requestTime : String, val requestId : String, val apiModel : ApiModel )