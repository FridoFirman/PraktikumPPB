package com.example.myapplication.day4.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentDay4MainBinding

class Day4MainFragment : Fragment() {
    private var _binding: FragmentDay4MainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDay4MainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnDetail.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("text", "Ini teks yang dikirim")

            findNavController().navigate(R.id.action_day4MainFragment_to_day4DetailFragment, bundle)
        }

        binding.btnSecondActivity.setOnClickListener {
            findNavController().navigate(R.id.action_day4MainFragment_to_day4SecondActivity)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}