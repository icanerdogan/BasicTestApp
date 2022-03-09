package com.icanerdogan.basictestapp

class Tax {
    // Vergi Hesapla
    fun calculateTax(grossIncome: Double, taxRate: Double) : Double{
        return grossIncome * taxRate
    }

    // Net Gelir Hesapla
    fun calculateIncome(grossIncome: Double , taxRate : Double) : Double{
        return grossIncome - (grossIncome * taxRate)
    }
}