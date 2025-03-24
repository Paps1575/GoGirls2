package com.uttt.go_girls.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uttt.go_girls.data.GoGirlsApi
import com.uttt.go_girls.model.ConductoraModel
import com.uttt.go_girls.model.PasajeraModel
import com.uttt.go_girls.model.ViajeModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val api: GoGirlsApi
) : ViewModel() {

    fun obtenerConductoras() {
        viewModelScope.launch {
            try {
                val conductoras: Response<ConductoraModel> = api.getCondutoras()
                // Manejar los datos obtenidos (puedes actualizar el estado aquí)
            } catch (e: Exception) {
                // Manejar el error
            }
        }
    }

    fun obtenerPasajeras() {
        viewModelScope.launch {
            try {
                val pasajeras: Response<PasajeraModel> = api.getPasajeras()
                // Manejar los datos obtenidos (puedes actualizar el estado aquí)
            } catch (e: Exception) {
                // Manejar el error
            }
        }
    }

    fun obtenerViaje(id: Int) {
        viewModelScope.launch {
            try {
                val viaje: ViajeModel = api.getViajeById(id)
                // Manejar el viaje obtenido (puedes actualizar el estado aquí)
            } catch (e: Exception) {
                // Manejar el error
            }
        }
    }
}