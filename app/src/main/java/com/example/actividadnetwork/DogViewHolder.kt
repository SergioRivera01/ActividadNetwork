package com.example.actividadnetwork

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.actividadnetwork.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder (view: View): RecyclerView.ViewHolder(view){

    private val bindig = ItemDogBinding.bind(view)

    fun bind (image:String){
        Picasso.get().load(image).into(bindig.ivDog)
    }
}