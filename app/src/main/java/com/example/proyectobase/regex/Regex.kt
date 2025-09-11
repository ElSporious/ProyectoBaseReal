package com.example.proyectobase.regex

object Regex {
    // Declara la Regex como una propiedad del objeto, se crea solo una vez.
    private val emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$".toRegex()

    // La función utiliza la propiedad para validar la cadena
    fun isValid(email: String): Boolean {
        return email.matches(emailRegex)
    }
}