package com.digitalhouse.dhwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.ContactAdapter
import com.digitalhouse.dhwallet.model.Contact
import com.digitalhouse.dhwallet.model.ContactType

class TransferFragment : Fragment(R.layout.fragment_transfer){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.recycler_transfer)
        //recycler.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)

        val listContact = MutableList(size = 10){
            Contact(
                image = "https://studiosol-a.akamaihd.net/uploadfile/letras/fotos/a/3/7/2/a372ee687749cef5ec6188750852ac96.jpg",
                name = "Jimi Hendrix",
                type = ContactType.AMIGO

            )
        }

        recycler.adapter = ContactAdapter(listContact)

    }
}
