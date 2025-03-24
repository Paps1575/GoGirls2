package com.uttt.go_girls

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.uttt.go_girls.navigation.NavManager
import com.uttt.go_girls.ui.theme.GO_GIRLSTheme
import com.uttt.go_girls.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel:MainViewModel by viewModels()
        enableEdgeToEdge()
        setContent {
            GO_GIRLSTheme {
                NavManager(viewModel)
            }
        }
    }
}

