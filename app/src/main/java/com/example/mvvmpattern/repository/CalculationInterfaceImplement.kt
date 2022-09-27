package com.example.mvvmpattern.repository

import androidx.lifecycle.MutableLiveData
import com.example.mvvmpattern.model.Data

class CalculationInterfaceImplement : CalculationInterface {
    override fun calculateSumAndSub(first: Int, second: Int): MutableLiveData<Data> {
        val mutableLiveData = MutableLiveData<Data>()
        val sum = first + second
        val sub = first - second
        val data = Data(sum, sub)
        mutableLiveData.postValue(data)
        return mutableLiveData
    }
}