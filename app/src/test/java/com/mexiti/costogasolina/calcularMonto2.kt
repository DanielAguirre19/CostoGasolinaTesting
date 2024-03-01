package com.mexiti.costogasolina

import org.junit.Test
import java.text.NumberFormat
import org.junit.Assert.assertEquals

class calcularMonto2 {
    @Test
    fun calcularMonto22_35_40l(){
        val precio = 22.35
        val cantLitros = 40.0
        val darPropina = false
        val propina = 0.0

        val montoEsperado = NumberFormat.getCurrencyInstance().format(894.0)
        val montoActual = calcularMonto(precio, cantLitros, darPropina = darPropina, propina = propina)

        assertEquals(montoEsperado, montoActual)
    }
}