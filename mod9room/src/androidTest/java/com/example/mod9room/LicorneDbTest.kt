package com.example.mod9room

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LicorneDbTest {
    lateinit var db : LicorneDatabase

    @Before
    fun getDb() {
        db = Room.inMemoryDatabaseBuilder(
            InstrumentationRegistry.getInstrumentation().context,
            LicorneDatabase::class.java
        ).build()
    }

    @Test
    fun checkInsertDb() {
        db.licorneDao().insert(Licorne(0,"Toto",10,"Bleu"))
        assert(db.licorneDao().getById(1).nom == "Toto")
    }

    @Test
    fun checkInsertDb2() {
        db.licorneDao().insert(Licorne(0,"Toto",10,"Bleu"))
        assert(db.licorneDao().getById(1).robe == "Bleu")
    }

    @After
    fun deco(): Unit {
        db.close()
    }
}