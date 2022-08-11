package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.dice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        var score = 0
        var level = 0

        binding.button.setOnClickListener {
            val dice1 = arrayOf(1, 2, 3, 4, 5, 6)
            val dice2 = arrayOf(1, 2, 3, 4, 5, 6)
            val dice3 = arrayOf(1, 2, 3, 4, 5, 6)

            val myRandomInt1 = dice1.random()
            val myRandomInt2 = dice2.random()
            val myRandomInt3 = dice3.random()

            binding.textView.text = myRandomInt1.toString()
            binding.textView2.text = myRandomInt2.toString()
            binding.textView3.text = myRandomInt3.toString()

            if (myRandomInt1 == 6 && myRandomInt2 == 6 || myRandomInt1 == 6 && myRandomInt3 == 6 || myRandomInt2 == 6 && myRandomInt3 == 6) {
                Toast.makeText(this, "Two Sikki", Toast.LENGTH_SHORT).show()
            }
            else if (myRandomInt1 == 6 && myRandomInt2 == 6 && myRandomInt3 == 6 ){
                Toast.makeText(this, "Oboyeeeeh!", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Try More", Toast.LENGTH_SHORT).show()
            }

            if (myRandomInt1 == 6 && myRandomInt2 == 6 || myRandomInt1 == 6 && myRandomInt3 == 6 || myRandomInt2 == 6 && myRandomInt3 == 6){
                score++
                binding.scoreNumber.text = score.toString()

            }

           if (score == 3){
               level++
               binding.level.text = level.toString()
           }else{
               level++
               binding.level.text = level.toString()
           }

        }


    }
}