package com.example.mvvmpattern.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mvvmpattern.R
import com.example.mvvmpattern.databinding.FragmentCalculationBinding
import com.example.mvvmpattern.model.Data
import com.example.mvvmpattern.viewmodel.CalculationViewModel


class Calculation : Fragment(R.layout.fragment_calculation) {
    private lateinit var binding: FragmentCalculationBinding
    private lateinit var navController: NavController

    private val calculationviewmodel = CalculationViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCalculationBinding.bind(view)
        navController = Navigation.findNavController(view)
        //to hide action bar
        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        binding.calculate.setOnClickListener()
        {
            val first = binding.E1.text.toString().toInt()
            val second = binding.E2.text.toString().toInt()
            calculationviewmodel.calculateSumAndSub(first, second)
                .observe(viewLifecycleOwner, Observer { data ->
                    binding.sum.text = data.sum.toString()
                    binding.sub.text = data.sub.toString()
                })
        }
    }
}