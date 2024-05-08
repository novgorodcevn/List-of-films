package com.example.qwerty.model.repository

import com.example.qwerty.data.MovieDetails
import com.example.qwerty.data.Movies
import com.example.qwerty.model.apis.ApiInterface
import com.example.qwerty.view.Constants.Companion.API_KEY

import retrofit2.Call

class MoviesDBRepositoryImpl : MoviesDBRepository {
    private val apiInterface = ApiInterface.create()

    override fun getMovies(): Call<Movies> {
        return apiInterface.getMovies(API_KEY)
    }

    override fun getMovieDetails(id: Int): Call<MovieDetails> {
        return apiInterface.getMovieDetails(id, API_KEY)
    }

}
