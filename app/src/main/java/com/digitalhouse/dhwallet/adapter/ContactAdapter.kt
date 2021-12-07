package com.digitalhouse.dhwallet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.Contact
import com.digitalhouse.dhwallet.util.load


class ContactAdapter( private val items: List<Contact>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val inflator = LayoutInflater.from(parent.context)
       return ContactViewHolder(inflator.inflate(R.layout.item_contact, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ContactViewHolder -> holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int = items.size
}

class ContactViewHolder(view: View): RecyclerView.ViewHolder(view){
    private val image: ImageView = view.findViewById(R.id.iv_contact_item)
    private val title: TextView = view.findViewById(R.id.item_contact_title)
    private val subtitle: TextView = view.findViewById(R.id.item_contact_sudtitle)

    fun bind(item: Contact){

//      Glide.with(image.context).load(item.image).circleCrop().into(image)
        image.load(image.context, image, item.image)
        title.text = item.name
        subtitle.text = item.type.description

    }
}
