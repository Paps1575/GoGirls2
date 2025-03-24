package com.uttt.go_girls.model

data class PasajeraModel(
    val id: Int,
    val nombre: String,
    val correo: String,
    val telefono: String?,
    val contadorViajes: Int,
    val fechaRegistro: String
)
