package com.example.annuairedecontact;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ContactDao {

    @Insert(onConflict =REPLACE)
    void insert(Contact contact);

    @Delete
    void delete(Contact contact);


    @Update
    void update(Contact contact);

    @Query("SELECT * FROM Contact")
    List<Contact> getAll();
    @Query("SELECT * FROM Contact where last_name LIKE '%' || :key || '%' ")
    List<Contact> getAllByname(String key);
}
