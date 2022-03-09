package com.icanerdogan.basictestapp

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {
    // Before: Her test fonksiyonu yapılmadan önce çalıştırılacak olan fonksiyonu belirler!
    private lateinit var tax: Tax
    @Before
    fun setup(){
        tax = Tax()
    }
    // After: Test bittikten sonra çalıştırılacak fonksiyonu belirler!
    @After
    fun teardown(){
        // Veritabanı kapatma fonksiyonu
    }

    // Test isimleri açıkça yazılmalıdır!
    // Aşağıda görüldüğü gibi 2 farklı şekilde yazılabilir!
    @Test
    fun `Calculating Tax Test`() {
        val tax = Tax()
        val netTaxt = tax.calculateTax(100.0, 0.1)
        // Değer istenen özelliklere göre ne yapacağı söylenir!
        assertThat(netTaxt).isEqualTo(10)
    }

    @Test
    fun calculateIncome() {
        val tax = Tax()
        val netIncome = tax.calculateTax(100.0, 40.0)

        assertThat(netIncome).isGreaterThan(30)
    }
}