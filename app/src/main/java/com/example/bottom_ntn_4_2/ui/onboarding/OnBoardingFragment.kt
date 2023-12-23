package com.example.bottom_ntn_4_2.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bottom_ntn_4_2.R
import com.example.bottom_ntn_4_2.databinding.ActivityMainBinding
import com.example.bottom_ntn_4_2.databinding.FragmentOnBoardingBinding
import com.example.bottom_ntn_4_2.ui.onboarding.adapter.OnBoardingAdapter

class OnBoardingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardingBinding
    private val adapter=OnBoardingAdapter(this::onClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FragmentOnBoardingBinding.inflate(inflater,container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewpager.adapter = adapter
        binding.indicator.setViewPager(binding.viewpager)
    }
    private fun onClick(){
        findNavController().navigate(R.id.navigation_home)
    }
}