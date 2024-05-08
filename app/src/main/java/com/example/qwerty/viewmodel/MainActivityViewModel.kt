package com.example.qwerty.viewmodel

import com.example.qwerty.data.User
import com.example.qwerty.model.repository.FirebaseRepository
import com.example.qwerty.model.repository.FirebaseRepositoryImpl
import com.google.firebase.ktx.Firebase

class MainActivityViewModel {
    private  val mFirebaseRepository: FirebaseRepository = FirebaseRepositoryImpl()

    fun updateUserData(firebaseUser: User, uid: String) {
        mFirebaseRepository.updateUserData(firebaseUser, uid)
    }
}