package com.example.test_lab_week_12

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.test_lab_week_12.model.Movie

class MovieAdapter(private val listener: MovieClickListener)
    : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private val movies = mutableListOf<Movie>()

    interface MovieClickListener {
        fun onMovieClick(movie: Movie)
    }

    fun addMovies(list: List<Movie>) {
        movies.clear()
        movies.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_movie_item, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val poster = itemView.findViewById<ImageView>(R.id.moviePoster)
        private val title = itemView.findViewById<TextView>(R.id.movieTitle)

        fun bind(movie: Movie) {
            title.text = movie.title

            Glide.with(itemView)
                .load("https://image.tmdb.org/t/p/w500${movie.posterPath}")
                .into(poster)

            itemView.setOnClickListener { listener.onMovieClick(movie) }
        }
    }
}
