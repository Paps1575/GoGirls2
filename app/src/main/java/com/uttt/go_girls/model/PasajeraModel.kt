package com.uttt.go_girls.model


import com.google.gson.annotations.SerializedName

data class PasajeraModel(
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
    @SerializedName("ContadorViajes")
    val contadorViajes: Int,
    @SerializedName("FechaRegistro")
    val fechaRegistro: String
)
