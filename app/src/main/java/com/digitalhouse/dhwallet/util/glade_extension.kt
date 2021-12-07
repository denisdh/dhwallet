package com.digitalhouse.dhwallet.util
import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.load(context: Context, id: ImageView, url: String){
    Glide.with(context).load(url).circleCrop().into(id)
}