package net.pms.ui.home

import android.view.View
import androidx.lifecycle.ViewModel
import net.pms.data.repositories.UserRepository
import net.pms.utils.startLoginActivity

class HomeViewModel(
    private val repository: UserRepository
) : ViewModel() {

    val user by lazy {
        repository.currentUser()
    }
    
    fun logout(view: View){
        repository.logout()
        view.context.startLoginActivity()
    }
}