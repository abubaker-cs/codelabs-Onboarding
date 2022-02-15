package org.abubaker.onboarding.fragments.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
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


            // Navigation.findNavController()
            // findNavController.navigate(R.id.action_viewPagerFragment_to_homeFragment)

            // navController = Navigation.findNavController( this, R.id.action_viewPagerFragment_to_homeFragment)
            // NavigationUI.setupActionBarWithNavController(this, navController )


            onBoardingFinished()
        }

        return mBinding.root
    }

    private fun onBoardingFinished() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

}