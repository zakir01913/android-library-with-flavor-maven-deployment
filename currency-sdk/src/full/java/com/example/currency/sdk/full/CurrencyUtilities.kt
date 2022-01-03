package com.example.currency.sdk.full

import com.example.currency.converter.CurrencyConverter
import com.example.currency.formatter.CurrencyFormatter

class CurrencyUtilities {
    /** Convert the amount into desire currency format
     *
     */
    fun convertTo(amount: Int): Int {
        return CurrencyConverter.convertTo(amount)
    }

    /** Format the amount into desire currency format
     *
     */
    fun formatCurrency(amount: Int): String {
        return CurrencyFormatter.formatCurrency(amount)
    }
}