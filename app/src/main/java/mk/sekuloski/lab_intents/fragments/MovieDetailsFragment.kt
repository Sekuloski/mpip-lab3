package mk.sekuloski.lab_intents.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mk.sekuloski.lab_intents.R
import mk.sekuloski.lab_intents.adapters.MoviesAdapter
import mk.sekuloski.lab_intents.data.movieList

class MovieDetailsFragment(position: Int) : Fragment() {
    val movie = position
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_details, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movieID: TextView = view.findViewById(R.id.movie_id)
        movieID.text = "ID: ${movieList()[movie].id}"

        val movieName: TextView = view.findViewById(R.id.movie_name)
        movieName.text = "Name: ${movieList()[movie].name}"

        val movieDescription: TextView = view.findViewById(R.id.movie_description)
        movieDescription.text = "Description: ${movieList()[movie].description}"

        val movieDirector: TextView = view.findViewById(R.id.movie_director)
        movieDirector.text = "Director: ${movieList()[movie].director}"

        val recyclerView: ListView = view.findViewById(R.id.actorView)
        recyclerView.adapter = ArrayAdapter(view.context, android.R.layout.simple_list_item_1,
            movieList()[movie].actors
        )


    }
}