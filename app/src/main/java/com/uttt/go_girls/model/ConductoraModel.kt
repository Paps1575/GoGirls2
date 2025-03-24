package com.uttt.go_girls.model

data class ConductoraModel (
    val id: Int,
    val nombre: String,
    val correo: String,
    val contraseña: String,
    val telefono: String?,
    val vehiculo: String,
    val placa: String?,
    val fechaRegistro: String
)