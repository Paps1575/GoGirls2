package com.uttt.go_girls.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.uttt.go_girls.model.ConductoraModel
import com.uttt.go_girls.viewModel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel) {
    LaunchedEffect(Unit) {
        viewModel.obtenerConductoras()
        viewModel.obtenerPasajeras()
        viewModel.obtenerViajes()
    }

    val conductoras = viewModel.conductoras.value
    val pasajeras = viewModel.pasajeras.value
    val viajes = viewModel.viajes.value

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Conductoras:")
        conductoras.forEach {
            Text(text = "Conductora: ${it.nombre}")
        }

        Text(text = "\nPasajeras:")
        pasajeras.forEach {
            Text(text = "Pasajera: ${it.nombre}")
        }

        Text(text = "\nViajes:")
        viajes.forEach {
            Text(text = "Viaje: ${it.origen} - ${it.destino}")
        }
    }
}