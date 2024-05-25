package com.example.support.ui.overview_time

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OverviewTimeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is wallet Fragment"
    }
    val text: LiveData<String> = _text
}