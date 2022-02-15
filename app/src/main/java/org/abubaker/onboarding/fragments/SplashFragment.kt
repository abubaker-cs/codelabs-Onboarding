package org.abubaker.onboarding.fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.abubaker.onboarding.R

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({

            // If the finished value is TRUE, then we will skip the ViewPager (instructions) and move
            // the user directly to the HOME screen
            if (onBoardingFinished()) {

                // Skip the Viewpager and move the user directly to the Home page
                findNavController().navigate(R.id.action_splashFragment_to_homeFragment)


            } else {

                // Start ViewPager to let the user see on-boarding instructions
                findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)

            }

        }, 3000)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


    private fun onBoardingFinished(): Boolean {

        // Get the onBoarding parameter from the SharedPreferences
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)

        // Reset the value of Finished to False
        return sharedPref.getBoolean("Finished", false)
    }

}