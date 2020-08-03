package com.ferdian.roomdatabase.repository

import androidx.lifecycle.LiveData
import com.ferdian.roomdatabase.data.UserDao
import com.ferdian.roomdatabase.model.User

class UserRepository(private val userDao: UserDao) {

    val readAllData : LiveData<List<User>> = userDao.getAllData()

    suspend fun addData(user: User) {
        userDao.addUser(user)
    }

    suspend fun updateData(user: User) {
        userDao.updateUser(user)
    }
}