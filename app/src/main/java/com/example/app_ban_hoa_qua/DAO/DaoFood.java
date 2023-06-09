package com.example.app_ban_hoa_qua.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.example.app_ban_hoa_qua.Entity.Foody;

import java.util.List;

@Dao
public interface DaoFood {

   @Query("Select * from food_db")
    List <Foody> FOODY_LIST();
   @Insert
    void insertFoody( Foody foody);
   @Update
    void updateFoody( Foody foody);
   @Delete
    void deleteFooy(Foody foody);



}
