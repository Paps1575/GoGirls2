package com.uttt.go_girls.data

import com.uttt.go_girls.model.ConductoraModel
import com.uttt.go_girls.model.PasajeraModel
import com.uttt.go_girls.model.ViajeModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GoGirlsApi {

    @GET("Conductoras")
    suspend fun getCondutoras():Response<ConductoraModel>

    @GET("Pasajeras")
    suspend fun getPasajeras():Response<PasajeraModel>

    @GET("Viajes")
    suspend fun getViajes():Response<ViajeModel>

    @GET("Viajes/{id}")
    suspend fun getViajeById(@Path("id") id: Int): ViajeModel
}