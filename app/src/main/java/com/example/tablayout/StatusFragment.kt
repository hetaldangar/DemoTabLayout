package com.example.tablayout

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.jar.Attributes


class StatusFragment : Fragment() {

    var details: ArrayList<Attributes.Name> = ArrayList()

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_chat, container, false)

        //  var recyclerview: RecyclerView = view.findViewById(R.id.recyclerview)


//        val statusTextView: TextView = view.findViewById(R.id.statusTextView)
//        statusTextView.text = "Your Updated Status"

        with(details) {

            var n1 = Attributes.Name("Hetal")
            var n2 = Attributes.Name("Priyanshi")
            var n3 = Attributes.Name("Tanvi")
            var n4 = Attributes.Name("Isha")
            var n5 = Attributes.Name("Keyuri")
            var n6 = Attributes.Name("Fremi")
            var n7 = Attributes.Name("Dhara")
            var n8 = Attributes.Name("Bhumika")
            var n9 = Attributes.Name("Krishna")
            var n10 = Attributes.Name("Krina")
            var n11 = Attributes.Name("Maitri")
            var n12 = Attributes.Name("Hemanshi")
            var n13 = Attributes.Name("Mirali")
            var n14 = Attributes.Name("Charmi")
            var n15 = Attributes.Name("Vrunda")
            var n16 = Attributes.Name("Hetal")
            var n17 = Attributes.Name("Priyanshi")
            var n18 = Attributes.Name("Tanvi")
            var n19 = Attributes.Name("Isha")
            var n20 = Attributes.Name("Keyuri")
            var n21 = Attributes.Name("Fremi")
            var n22 = Attributes.Name("Dhara")
            var n23 = Attributes.Name("Bhumika")
            var n24 = Attributes.Name("Krishna")
            var n25 = Attributes.Name("Krina")
            var n26 = Attributes.Name("Maitri")
            var n27 = Attributes.Name("Hemanshi")
            var n28 = Attributes.Name("Mirali")
            var n29 = Attributes.Name("Charmi")
            var n30 = Attributes.Name("Vrunda")




            add(n1)
            add(n2)
            add(n3)
            add(n4)
            add(n5)
            add(n6)
            add(n7)
            add(n8)
            add(n9)
            add(n10)
            add(n11)
            add(n12)
            add(n13)
            add(n14)
            add(n15)
            add(n16)
            add(n17)
            add(n18)
            add(n19)
            add(n20)
            add(n21)
            add(n22)
            add(n23)
            add(n24)
            add(n25)
            add(n26)
            add(n27)
            add(n28)
            add(n29)
            add(n30)






            var recyclerView: RecyclerView = view.findViewById(R.id.recyclerview)
            recyclerView.layoutManager = LinearLayoutManager(context)


            val chatAdapter = StatusAdapter(context, details, ArrayList<Attributes.Name>())
            recyclerView.adapter = chatAdapter

            return view

        }
    }



}

