package com.baldezh.lab5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.baldezh.lab5.databinding.ActivityInputBinding

class InputActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInputBinding

    companion object {
        var radius: Double = 0.0
        var isSquareChecked: Boolean = false
        var isLengthChecked: Boolean = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            val radiusInput = binding.distance.text.toString()
            if (radiusInput.isNotEmpty()) {
                radius = radiusInput.toDouble()
                isSquareChecked = binding.squareCheckBox.isChecked
                isLengthChecked = binding.lengthCheckBox.isChecked
                finish()
            } else {
                Toast.makeText(this, "Введите радиус", Toast.LENGTH_SHORT).show()
            }
        }
    }
}