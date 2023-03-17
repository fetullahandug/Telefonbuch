package com.example.telefonbuch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.example.telefonbuch.R
import com.example.telefonbuch.adapter.ItemAdapter
import com.example.telefonbuch.data.Datasource
import com.example.telefonbuch.databinding.FragmentPhonebookBinding

class PhonebookFragment : Fragment() {
    private lateinit var binding : FragmentPhonebookBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_phonebook, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val movies = Datasource().getContactList()
        var recyclerview_contacts = binding.recylerViewPhonebook

        recyclerview_contacts.adapter = ItemAdapter(movies)
        recyclerview_contacts.setHasFixedSize(true)
    }
}