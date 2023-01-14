package mk.sekuloski.lab_intents.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import mk.sekuloski.lab_intents.R
import mk.sekuloski.lab_intents.adapters.MoviesAdapter
import mk.sekuloski.lab_intents.data.movieList


class MovieListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private var movieButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.listView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = MoviesAdapter(movieList())
    }
}