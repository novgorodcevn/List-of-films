package com.example.qwerty.model.repository

import com.example.qwerty.data.MovieDetails
import com.example.qwerty.data.Movies
import retrofit2.Call

interface MoviesDBRepository {

    fun getMovies() : Call<Movies>

    fun getMovieDetails(id: Int) : Call<MovieDetails>


}