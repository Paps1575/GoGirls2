package com.uttt.go_girls.model

import com.google.gson.annotations.SerializedName

data class ConductoraModel (
    @SerializedName("Id")
    val id: Int,
    @SerializedName("Nombre")
    val nombre: String,
    @SerializedName("Correo")
    val correo: String,
    @SerializedName("Contraseña")
    val contraseña: String,
    @SerializedName("Telefono")
    val telefono: String?,
    @SerializedName("Vehiculo")
    val vehiculo: String,
    @SerializedName("Placa")
    val placa: String?,
    @SerializedName("FechaRegistro")
    val fechaRegistro: String
)
