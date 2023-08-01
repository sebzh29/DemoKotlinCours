package com.example.mod9room

import androidx.room.Entity
import androidx.room.PrimaryKey

//Permet d'être utilisé dans ue DAO Room
@Entity
data class Licorne(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val nom: String,
    val tailleCorne: Int,
    val robe: String
)