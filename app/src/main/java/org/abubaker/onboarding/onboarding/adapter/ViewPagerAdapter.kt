package org.abubaker.onboarding.onboarding.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    list: ArrayList<Fragment>,
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    // Array for storing reference to all of our on-boarding screens.
    private val fragmentList = list

    // Total Items
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    // Current Position
    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}