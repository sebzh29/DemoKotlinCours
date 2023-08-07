package com.example.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10recyclerview.databinding.TemplateFilmBinding

class FilmAdapter(val  arrayListFilms : ArrayList<Film> ) :
    RecyclerView.Adapter<FilmAdapter.FilmVH>() {
    class FilmVH(val binding: TemplateFilmBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmVH {
        val binding = TemplateFilmBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return FilmVH(binding)
    }

    override fun getItemCount(): Int = arrayListFilms.size

    //Affiche un element de lsite
    override fun onBindViewHolder(holder: FilmVH, position: Int) {
        holder.binding.film = arrayListFilms[position]
    }


}
