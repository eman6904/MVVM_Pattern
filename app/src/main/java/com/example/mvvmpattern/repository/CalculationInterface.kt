package com.example.mvvmpattern.repository

import androidx.lifecycle.MutableLiveData
import com.example.mvvmpattern.model.Data

interface CalculationInterface {

    fun calculateSumAndSub(first:Int,second:Int):MutableLiveData<Data>
}