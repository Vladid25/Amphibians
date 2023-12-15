package com.example.amphibians.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.amphibians.data.AmphibiansRepository
import com.example.amphibians.model.Amphibian

sealed interface AmphibiansUiState{
    data class Success(val info:List<Amphibian>):AmphibiansUiState
    object Error:AmphibiansUiState
    object Loading:AmphibiansUiState
}

class AmphibiansViewModel (private val amphibiansRepository: AmphibiansRepository):ViewModel(){
    var amphibiansUiState:AmphibiansUiState by mutableStateOf(AmphibiansUiState.Loading)
        private set


}