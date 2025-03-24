package com.uttt.go_girls.model

data class ViajeModel(
    val id: Int,
    val pasajera_id: Int,
    val conductora_id: Int,
    val origen: String,
    val destino: String,
    val fechaSolicitud: String,
    val fechaInicio: String?,
    val fechaFin: String?,
    val tarifa: Double,
    val viajeGratis: Boolean,
    val estado: String
)
