package org.abubaker.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.abubaker.onboarding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the activity_main.xml file
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(mBinding.root)

        // Hide the Actionbar from the activity_main
        supportActionBar?.hide()

    }
}