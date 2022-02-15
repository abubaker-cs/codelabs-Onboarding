package org.abubaker.onboarding.fragments.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import org.abubaker.onboarding.R
import org.abubaker.onboarding.databinding.FragmentThirdScreenBinding


class ThirdScreen : Fragment() {

    private lateinit var mBinding: FragmentThirdScreenBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentThirdScreenBinding.inflate(inflater, container, false)

        // Button: Finish
        mBinding.btnFinish.setOnClickListener {

            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            onBoardingFinished()

        }

        return mBinding.root
    }

    private fun onBoardingFinished() {

        // Pass onBoarding to the sharedPref
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)

        // Open Editor
        val editor = sharedPref.edit()

        // We are using Boolean to define the current state of the process
        editor.putBoolean("Finished", true)

        //
        editor.apply()

    }

}