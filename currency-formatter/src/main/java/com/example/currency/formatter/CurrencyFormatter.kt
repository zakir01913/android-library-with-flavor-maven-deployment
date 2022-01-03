package com.example.currency.formatter

import android.util.Log

object CurrencyFormatter {
    private var TAG = "CurrencyFormatter"

    fun formatCurrency(amount: Int) : String {
        Log.d(TAG, "Successfully format the amount $amount")
        return "$amount"
    }
}