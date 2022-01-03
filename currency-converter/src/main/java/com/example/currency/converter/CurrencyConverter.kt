package com.example.currency.converter

import android.util.Log

object CurrencyConverter {
    private var TAG = "CurrencyConverter"

    fun convertTo(amount: Int): Int {
        Log.d(TAG, "Successfully convert the amount $amount")
        return amount
    }
}