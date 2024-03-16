package com.example.tablayout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.jar.Attributes

class StatusAdapter (
    context: Context?,
    var details: ArrayList<Attributes.Name>,
    arrayList: ArrayList<Attributes.Name>) : RecyclerView.Adapter<StatusAdapter.MyViewHolder>() {
    class MyViewHolder(v : View) : RecyclerView.ViewHolder(v){

        var image =v.findViewById<ImageView>(R.id.imageview)
        var name =v.findViewById<TextView>(R.id.textview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusAdapter.MyViewHolder {

        var v = LayoutInflater.from(parent.context).inflate(R.layout.status_item_file, parent, false)
        var holder=MyViewHolder(v)

        return holder
    }

    override fun onBindViewHolder(holder: StatusAdapter.MyViewHolder, position: Int) {
        holder.name.setText(details.get(position).toString())

    }

    override fun getItemCount(): Int {

        return details.size
    }
}