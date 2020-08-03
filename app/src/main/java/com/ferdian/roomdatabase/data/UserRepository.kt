package com.ferdian.roomdatabase.data

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    val readAllData : LiveData<List<User>> = userDao.getAllData()

    suspend fun addData(user: User) {
        userDao.addUser(user)
    }
}