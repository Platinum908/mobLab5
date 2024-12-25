package com.baldezh.lab5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.baldezh.lab5.databinding.ActivityCalcBinding

class CalcActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalcBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val radius = InputActivity.radius
        val isSquareChecked = InputActivity.isSquareChecked
        val isLengthChecked = InputActivity.isLengthChecked

        val calc = Calc(radius)
        val results = mutableListOf<String>()
        if (isSquareChecked) {
            results.add("Площадь круга: %.2f".format(calc.calcSquare()))
        }
        if (isLengthChecked) {
            results.add("Длина окружности: %.2f".format(calc.calcLength()))
        }

        binding.resultView.text = results.joinToString("\n")

        binding.backButton.setOnClickListener {
            finish()
        }
    }
}

