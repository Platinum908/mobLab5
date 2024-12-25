package com.baldezh.lab5

class Calc(private val radius: Double) {

    fun calcSquare(): Double {
        return Math.PI * radius * radius
    }

    fun calcLength(): Double {
        return 2 * Math.PI * radius
    }
}