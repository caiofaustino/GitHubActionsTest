package dev.caiofaustino.githubactionstest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val versionMutableLiveData = MutableLiveData<String>()
    val versionLiveData: LiveData<String> = versionMutableLiveData

    init {
        versionMutableLiveData.value = "${BuildConfig.VERSION_NAME} - Not a hotfix anymore."
    }
}
