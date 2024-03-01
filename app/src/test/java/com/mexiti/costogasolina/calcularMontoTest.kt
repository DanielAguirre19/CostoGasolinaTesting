package com.mexiti.costogasolina

import org.junit.Test
import java.text.NumberFormat
import org.junit.Assert.assertEquals

class calcularMontoTest {
    @Test
    fun calcularMonto23_94_20l(){
        val precio = 23.94
        val cantLitros = 20.0
        val darPropina = false
        val propina = 0.0

        val montoEsperado = NumberFormat.getCurrencyInstance().format(478.8)
        val montoActual = calcularMonto(precio, cantLitros, darPropina = darPropina, propina = propina)

        assertEquals(montoEsperado, montoActual)
    }
}