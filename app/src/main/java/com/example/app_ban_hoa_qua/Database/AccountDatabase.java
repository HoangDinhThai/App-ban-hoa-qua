package com.example.app_ban_hoa_qua.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.app_ban_hoa_qua.DAO.DaoAccount;
import com.example.app_ban_hoa_qua.Entity.Account;

@Database(entities= Account.class, version = 1)
public abstract class AccountDatabase  extends RoomDatabase {

    private static final String DATABASE_NAME="account_db";

    public abstract DaoAccount daoAccount();

    private static AccountDatabase instance;

    public static synchronized AccountDatabase getInstance(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(),AccountDatabase.class
                            ,DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

}
