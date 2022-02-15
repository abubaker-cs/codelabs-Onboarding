package org.abubaker.onboarding.fragments.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import org.abubaker.onboarding.R
import org.abubaker.onboarding.databinding.FragmentSecondScreenBinding

class SecondScreen : Fragment() {

    private lateinit var mBinding: FragmentSecondScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentSecondScreenBinding.inflate(inflater, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        // Button: Next
        mBinding.btnNext.setOnClickListener {
            viewPager?.currentItem = 2
        }

        return mBinding.root
    }

}