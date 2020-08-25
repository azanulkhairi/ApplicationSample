package com.honeybadger.applicationsample.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.honeybadger.applicationsample.fragment.homefragment.AnotherMenuFragment
import com.honeybadger.applicationsample.fragment.homefragment.GameMenuFragment

class HomeViewAdapter(fm:FragmentManager) :FragmentPagerAdapter (fm){
    override fun getItem(position: Int): Fragment {
       return when (position){
           0 -> {
               GameMenuFragment()
           }
           1 -> {
               AnotherMenuFragment()
           }
           else -> {
               GameMenuFragment()
           }
       }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "Game Menu"
            1 -> "Another Menu"
            else -> {
                "Game Menu"
            }
        }
    }
}