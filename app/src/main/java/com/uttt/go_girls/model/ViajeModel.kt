package com.uttt.go_girls.model

import com.google.gson.annotations.SerializedName

data class ViajeModel(
    @SerializedName("Id")
    val id: Int,

    @SerializedName("PasajeraId")
    val pasajeraId: Int,

    @SerializedName("ConductoraId")
    val conductoraId: Int,

    @SerializedName("Origen")
    val origen: String,

    @SerializedName("Destino")
    val destino: String,

    @SerializedName("FechaSolicitud")
    val fechaSolicitud: String,

    @SerializedName("FechaInicio")
    val fechaInicio: String?,

    @SerializedName("FechaFin")
    val fechaFin: String?,

    @SerializedName("Tarifa")
    val tarifa: Double,

    @SerializedName("ViajeGratis")
    val viajeGratis: Boolean,

    @SerializedName("Estado")
    val estado: String,

    @SerializedName("Pasajera")
    val pasajera: PasajeraModel,

    @SerializedName("Conductora")
    val conductora: ConductoraModel
)