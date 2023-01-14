package mk.sekuloski.lab_intents.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mk.sekuloski.lab_intents.R
import mk.sekuloski.lab_intents.models.Data

class MovieApiAdapter(private val context: Context, private var movies: MutableList<Data>) :
    RecyclerView.Adapter<MovieApiAdapter.MovieHolder>() {

    class MovieHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.movie_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_list, parent, false)
        return MovieHolder(view)

    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        val currentMovie = movies[position]

        holder.title.text = "title: ${currentMovie.Title}"
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun updateData(data: MutableList<Data>){
        this.movies = data
    }
}