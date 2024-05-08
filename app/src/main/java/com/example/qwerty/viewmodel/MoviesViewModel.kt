package com.example.qwerty.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.qwerty.data.MovieDetails
import com.example.qwerty.data.Movies
import com.example.qwerty.data.Result
import com.example.qwerty.model.repository.MoviesDBRepository
import com.example.qwerty.model.repository.MoviesDBRepositoryImpl
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesViewModel {

    private val _movies = MutableLiveData<List<Result?>>()
    val movies: LiveData<List<Result?>> = _movies

    private val _movieDetails = MutableLiveData<MovieDetails>()
    val movieDetails: LiveData<MovieDetails> = _movieDetails

    private val mMoviesRepository: MoviesDBRepository = MoviesDBRepositoryImpl()

    fun getMovies() {
        val response = mMoviesRepository.getMovies()
        response.enqueue(object : Callback<Movies> {
            override fun onResponse(call: Call<Movies>?, response: Response<Movies>?) {
                _movies.postValue(response?.body()?.results)
            }

            override fun onFailure(call: Call<Movies>?, t: Throwable?) {

            }
        })
    }

    fun getMovieDetails(id: Int) {
        val response = mMoviesRepository.getMovieDetails(id)
        response.enqueue(object : Callback<MovieDetails> {
            override fun onResponse(call: Call<MovieDetails>?, response: Response<MovieDetails>?) {
                _movieDetails.postValue(response?.body())
            }

            override fun onFailure(call: Call<MovieDetails>?, t: Throwable?) {

            }
        })
    }

}