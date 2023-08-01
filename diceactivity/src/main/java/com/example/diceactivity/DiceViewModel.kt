package com.example.diceactivity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    var dice = MutableLiveData(0)

//    fun inc() {
//        dice.value = dice.value?. inc()
//    }

    fun launchDice(faceMax : Int) {
        val result = (1..faceMax).random()
        dice.value = result
        //ou
        //return result
    }

}