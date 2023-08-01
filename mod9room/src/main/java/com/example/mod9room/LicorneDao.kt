package com.example.mod9room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface LicorneDao {

    @Insert
    fun insert(Licorne: Licorne)

    @Query("SELECT * FROM licorne")
    fun qetAll() : List<Licorne>

    @Query("SELECT * FROM licorne WHERE id=:id")
    fun getById(id: Long) : Licorne

    @Query("SELECT * FROM licorne WHERE tailleCorne = :length")
    fun getLicorneByHornLength(length: Int): List<Licorne>

    @Update
    fun update(Licorne: Licorne)
}