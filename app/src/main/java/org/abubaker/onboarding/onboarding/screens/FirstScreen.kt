package org.abubaker.onboarding.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import org.abubaker.onboarding.R
import org.abubaker.onboarding.databinding.FragmentFirstScreenBinding
import org.abubaker.onboarding.databinding.FragmentViewPagerBinding

class FirstScreen : Fragment() {

    private lateinit var mBinding: FragmentFirstScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentFirstScreenBinding.inflate(inflater, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        mBinding.next.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return mBinding.root
    }


}