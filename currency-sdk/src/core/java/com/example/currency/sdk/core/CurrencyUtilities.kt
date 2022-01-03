package com.example.currency.sdk.core

import com.example.currency.converter.CurrencyConverter

class CurrencyUtilities {
    /** Convert the amount into desire currency format
     *
     */
    fun convertTo(amount: Int): Int {
        return CurrencyConverter.convertTo(amount)
    }
}