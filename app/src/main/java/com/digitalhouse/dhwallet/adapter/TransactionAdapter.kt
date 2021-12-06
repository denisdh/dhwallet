package com.digitalhouse.dhwallet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.GroupTransaction
import com.digitalhouse.dhwallet.model.GroupType


private const val HEADER = 0
private const val CONTENT = 1

class TransactionAdapter(private val items: List<GroupTransaction>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflator = LayoutInflater.from(parent.context)

        if(viewType == HEADER){
            return HeaderViewHolder(inflator.inflate(R.layout.item_header_transaction, parent, false))
        }

        return TransactionViewHolder(inflator.inflate(R.layout.item_transaction, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is HeaderViewHolder ->  holder.bindHeader(items[position].title ?: "DH Wallet")
            is TransactionViewHolder -> holder.bind(items[position])
        }
    }


    override fun getItemViewType(position: Int): Int {
        if(items[position].type == GroupType.TITLE){
            return HEADER
        }
        return CONTENT
    }

    override fun getItemCount(): Int = items.size

}

class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val title: TextView = view.findViewById(R.id.header_transaction_title)
    fun bindHeader(transactionTitle: String){
        title.text = transactionTitle
    }
}

class TransactionViewHolder(view: View): RecyclerView.ViewHolder(view){

    private val image : ImageView = view.findViewById(R.id.item_transaction_image)
    private val title : TextView = view.findViewById(R.id.item_transaction_title)
    private val subtitle : TextView = view.findViewById(R.id.item_transaction_subtitle)
    private val value : TextView = view.findViewById(R.id.item_transaction_value)

    fun bind(item: GroupTransaction){
        Glide.with(image.context).load(item.image).circleCrop().into(image);
        title.text = item.title
        subtitle.text = item.subtitle
        value.text = item.value
    }

}
