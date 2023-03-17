package com.example.telefonbuch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.telefonbuch.R
import com.example.telefonbuch.data.model.Contact
import com.example.telefonbuch.ui.PhonebookFragmentDirections

class ItemAdapter(var dataset: MutableList<Contact>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tv_name = itemView.findViewById<TextView>(R.id.textView_name)
        val tv_number = itemView.findViewById<TextView>(R.id.textView_number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(itemLayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.tv_name.text = item.name
        holder.tv_name.text = item.number

        holder.itemView.setOnClickListener{
            var navController = holder.itemView.findNavController()
            navController.navigate(PhonebookFragmentDirections.actionPhonebookFragmentToPhonebookitemFragment(contactName = item.name, contactNumber = item.number))
        }
    }






}

