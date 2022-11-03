package com.example.myapplication.day4.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentDay4DetailBinding
import com.example.myapplication.day4.adapter.SectionPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class Day4DetailFragment : Fragment() {

    private var _binding: FragmentDay4DetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDay4DetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViewPager()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setupViewPager() {
        val sectionPagerAdapter = SectionPagerAdapter(parentFragmentManager, lifecycle)
        val viewPager = binding.viewPager
        val tabs = binding.tabs

        viewPager.adapter = sectionPagerAdapter
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = arrayOf("First", "Second")[position]
        }.attach()
    }
}