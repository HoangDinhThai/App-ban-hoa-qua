package com.example.app_ban_hoa_qua.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.app_ban_hoa_qua.DAO.DaoBuy;
import com.example.app_ban_hoa_qua.DAO.DaoOrder;
import com.example.app_ban_hoa_qua.Entity.Buy;
import com.example.app_ban_hoa_qua.Entity.Order;

@Database(entities = Buy.class,version = 1)
public abstract class BuyDatabase extends RoomDatabase {
    private static final String DATABASE_NAME="buy_db";
    public abstract DaoBuy daoBuy();
    private static BuyDatabase instance;

    public static synchronized BuyDatabase getInstance(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(), BuyDatabase.class
                    ,DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
