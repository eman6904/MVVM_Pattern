package com.example.mvvmpattern.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmpattern.model.Data
import com.example.mvvmpattern.repository.CalculationInterfaceImplement

class CalculationViewModel :ViewModel(){
    val calculationInterfaceImpl=CalculationInterfaceImplement()
   fun  calculateSumAndSub(first:Int,second:Int):LiveData<Data>
   {
       val mutablelivedata=calculationInterfaceImpl.calculateSumAndSub(first,second)
       return mutablelivedata
   }
}