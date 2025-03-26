package com.uttt.go_girls.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
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

    private val _conductoras = mutableStateOf<List<ConductoraModel>>(emptyList())
    val conductoras: State<List<ConductoraModel>> get() = _conductoras

    private val _pasajeras = mutableStateOf<List<PasajeraModel>>(emptyList())
    val pasajeras: State<List<PasajeraModel>> get() = _pasajeras

    private val _viajes = mutableStateOf<List<ViajeModel>>(emptyList())
    val viajes: State<List<ViajeModel>> get() = _viajes

    fun obtenerConductoras() {
        viewModelScope.launch {
            try {
                val response: Response<List<ConductoraModel>> = api.getCondutoras()
                if (response.isSuccessful) {
                    _conductoras.value = response.body() ?: emptyList()
                }
            } catch (e: Exception) {
                // Manejar error
            }
        }
    }

    fun obtenerPasajeras() {
        viewModelScope.launch {
            try {
                val response: Response<List<PasajeraModel>> = api.getPasajeras()
                if (response.isSuccessful) {
                    _pasajeras.value = response.body() ?: emptyList()
                }
            } catch (e: Exception) {
                // Manejar error
            }
        }
    }

    fun obtenerViajes() {
        viewModelScope.launch {
            try {
                val response: Response<List<ViajeModel>> = api.getViajes()
                if (response.isSuccessful) {
                    _viajes.value = response.body() ?: emptyList()
                }
            } catch (e: Exception) {
                // Manejar error
            }
        }
    }
}
