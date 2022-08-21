package ir.MrMohamadHosein.dependencyinjectionKoin

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel
    (private val imageLoaderService: ImageLoaderService) : ViewModel() {

    init {
        Log.v("testLog" , "view model is ready!")
    }

}