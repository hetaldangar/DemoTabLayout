package com.example.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabLayoutAdapter(supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(supportFragmentManager) {


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        when (position) {
            0 -> {
                //chat
                return ChatFragment()
            }

            1 -> {
                //status
                return StatusFragment()
            }

            2 -> {
                //call
                return CallFragment()
            }

        }

        return null!!

    }



}
