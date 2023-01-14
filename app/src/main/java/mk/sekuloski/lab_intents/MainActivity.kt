package mk.sekuloski.lab_intents

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import mk.sekuloski.lab_intents.adapters.MoviesAdapter
import mk.sekuloski.lab_intents.data.Movie
import mk.sekuloski.lab_intents.data.movieList
import mk.sekuloski.lab_intents.fragments.MovieDetailsFragment
import mk.sekuloski.lab_intents.fragments.MovieListFragment

class MainActivity : AppCompatActivity() {
    private val movieAdapter: MoviesAdapter = MoviesAdapter(movieList())
    private val movies: List<Movie>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, MovieListFragment())
            commit()
        }

    }

    fun changeMovieFragment(position: Int)
    {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, MovieDetailsFragment(position))
            addToBackStack(null)
            commit()
        }
    }

}