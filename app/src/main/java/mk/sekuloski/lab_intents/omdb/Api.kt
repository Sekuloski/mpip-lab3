package mk.sekuloski.lab_intents.omdb

import mk.sekuloski.lab_intents.models.MovieList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET(".")
    fun getMoviesByTitle(@Query("apikey") apiKey: String,
                         @Query("page") page: String,
                         @Query("type") type: String,
                         @Query("s") s: String): Call<MovieList>
}