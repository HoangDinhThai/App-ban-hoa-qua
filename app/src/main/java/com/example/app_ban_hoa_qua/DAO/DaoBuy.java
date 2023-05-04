package com.example.app_ban_hoa_qua.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.app_ban_hoa_qua.Entity.Buy;
import com.example.app_ban_hoa_qua.Entity.Order;

import java.util.List;

@Dao
public interface DaoBuy {

    @Query("Select * from buy_db")

    List<Buy> BUY_LIST();

    @Insert
    void insertorder(Buy buy);



}
