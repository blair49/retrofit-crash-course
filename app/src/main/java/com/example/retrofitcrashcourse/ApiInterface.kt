package com.example.retrofitcrashcourse

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}
