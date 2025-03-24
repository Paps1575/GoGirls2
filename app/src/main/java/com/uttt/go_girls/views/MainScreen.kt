package com.uttt.go_girls.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.uttt.go_girls.model.ConductoraModel
import com.uttt.go_girls.viewModel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel) {
    // Llamada a la API para obtener datos
    viewModel.obtenerConductoras()

    // Aquí debes observar el estado y mostrar los datos
    // Por ejemplo, si se obtienen las conductoras, lo mostrarías así:

    Column(modifier = Modifier.padding(16.dp)) {
        // Suponiendo que tienes una lista de conductoras en el ViewModel
        // Reemplaza con tu estado real, como una lista observada
        val conductoras = listOf(ConductoraModel(1, "Nombre", "correo@example.com", "contraseña", "1234567890", "Auto", "ABC123", "2023-03-23"))
        conductoras.forEach {
            Text(text = "Conductora: ${it.nombre}")
        }
    }
}