package com.example.diceactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.diceactivity.databinding.ActivityDiceBinding

class DiceActivity : AppCompatActivity() {
    lateinit var  binding: ActivityDiceBinding
    val vm by viewModels<DiceViewModel> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dice)
        binding.vm = vm
        vm.dice.observe(this){valueDice ->
            if(valueDice > 10)
                binding.textViewCounter.setTextColor(getColor(android.R.color.holo_blue_dark))
            else
                binding.textViewCounter.setTextColor(getColor(android.R.color.black))
        }
        binding.lifecycleOwner = this
    }
}