package mk.sekuloski.lab_intents.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import mk.sekuloski.lab_intents.MainActivity
import mk.sekuloski.lab_intents.R
import mk.sekuloski.lab_intents.data.Movie

class MoviesAdapter(val movies: MutableList<Movie>): RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {
    class MovieViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        private var movieButton: Button
        private var currentMovie: Movie?
        private var mContext: Context?
        init {
            currentMovie = null
            movieButton = itemView.findViewById(R.id.movie_info)
            mContext = itemView.context
        }

        @SuppressLint("SetTextI18n")
        fun bind(movie:Movie, position: Int) {
            this.currentMovie = movie
            movieButton.text = movie.name
            movieButton.id = position
            movieButton.setOnClickListener {
                if (mContext is MainActivity) {
                    (mContext as MainActivity).changeMovieFragment(position)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_list,parent,false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position], position)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

}