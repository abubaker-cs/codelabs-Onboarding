package org.abubaker.onboarding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.abubaker.onboarding.databinding.FragmentViewPagerBinding
import org.abubaker.onboarding.fragments.onboarding.adapter.ViewPagerAdapter
import org.abubaker.onboarding.fragments.onboarding.screens.FirstScreen
import org.abubaker.onboarding.fragments.onboarding.screens.SecondScreen
import org.abubaker.onboarding.fragments.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

    private lateinit var mBinding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        // Inflate the layout for this fragment
        mBinding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        mBinding.viewPager.adapter = adapter

        return mBinding.root
    }

}