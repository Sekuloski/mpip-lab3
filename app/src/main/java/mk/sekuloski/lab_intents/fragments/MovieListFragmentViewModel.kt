package mk.sekuloski.lab_intents.fragments

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import mk.sekuloski.lab_intents.models.MovieList
import mk.sekuloski.lab_intents.omdb.Api
import mk.sekuloski.lab_intents.omdb.Client
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieListFragmentViewModel(application: Application): AndroidViewModel(application) {

    private var client: Api = Client.getOMDbApi()!!
    private var app: Application = application
    private var movieListMutableLiveData: MutableLiveData<MovieList> = MutableLiveData()

    fun search(title: String)
    {
        client.getMoviesByTitle("921feb99", "1", "movie", title).enqueue(object :
            Callback<MovieList> {
            override fun onResponse(call: Call<MovieList>?, response: Response<MovieList>) {
                if (response.body() != null)
                {
                    val movies: MovieList = response.body()
                    movieListMutableLiveData.postValue(movies)


                }
                else
                {
                    println("Error")
                }
        }

            override fun onFailure(call: Call<MovieList>?, t: Throwable?) {
                println("Error")
            }
        })}
}