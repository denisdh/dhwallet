package com.digitalhouse.dhwallet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.Transaction

class TransactionAdapter(private val items: List<Transaction>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        return TransactionViewHolder(inflator.inflate(R.layout.item_transaction, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is TransactionViewHolder -> holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int = items.size

}

class TransactionViewHolder(view: View): RecyclerView.ViewHolder(view){

    private val title : TextView = view.findViewById(R.id.item_transaction_title)
    private val subtitle : TextView = view.findViewById(R.id.item_transaction_subtitle)
    private val value : TextView = view.findViewById(R.id.item_transaction_value)

    fun bind(item: Transaction){
        title.text = item.title
        subtitle.text = item.subtitle
        value.text = "+ R$ " + item.value
    }

}
