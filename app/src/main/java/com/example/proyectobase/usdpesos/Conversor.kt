package com.example.proyectobase.usdpesos

object Conversor {
    fun convertir_usd_double(valorPesos: Int):Double {
        var tipoCambio:Double = 900.0
        var resultado:Double = valorPesos / tipoCambio
        return resultado
    }

    fun convertir_usd_string(valorPesos:Int):String{
        var tipoCambio:Double = 900.0
        var resultado:Double = valorPesos / tipoCambio
        return resultado.toString()
    }

    fun convertir_usd_ind(valorPesos: Int):Int{
        var tipoCambio:Int = 900
        var resultado:Int = valorPesos / tipoCambio
        return resultado
    }
}