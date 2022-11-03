package com.example.myapplication.day4.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.day4.ui.detail.Day4FirstFragment
import com.example.myapplication.day4.ui.detail.Day4SecondFragment

class SectionPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = Day4FirstFragment()
            1 -> fragment = Day4SecondFragment()
        }
        return fragment as Fragment
    }
}