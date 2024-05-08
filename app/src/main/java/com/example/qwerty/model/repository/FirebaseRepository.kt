package com.example.qwerty.model.repository

import com.example.qwerty.data.User

interface FirebaseRepository {
    fun updateUserData(firebaseUser: User,uid: String)
}