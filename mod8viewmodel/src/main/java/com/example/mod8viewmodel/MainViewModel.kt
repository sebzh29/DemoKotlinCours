package com.example.mod8viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    var compteur = MutableLiveData(0)


//    var compteur = 0
//    fun inc() = ++compteur // on incremente piis on retourne le compteur

    fun inc() {
        compteur.value = compteur.value?. inc()
    }
}