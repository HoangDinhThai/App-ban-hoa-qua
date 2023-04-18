package com.example.app_ban_hoa_qua.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.app_ban_hoa_qua.Entity.Account;

import java.util.List;

@Dao
public interface DaoAccount  {

//    @Query("select * from account_db where user ")
//    List <String> STRING_LISTUSER();
//
//    @Query("select * from account_db where pass ")
//    List <String> STRING_LISTPASS();


    //@Query("select * from account_db")
    List<android.accounts.Account> ACCOUNT_LIST();

    @Insert()
    void insert_account(Account account);

    @Update
    void update_account (Account account);

    @Delete
    void delete_account( Account account);

}
