package com.example.app_ban_hoa_qua.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.app_ban_hoa_qua.DAO.DaoAccount;
import com.example.app_ban_hoa_qua.DAO.DaoOrder;
import com.example.app_ban_hoa_qua.Entity.Order;

import java.util.concurrent.SynchronousQueue;

@Database(entities = Order.class,version = 1)
public abstract class OrderDatabase extends RoomDatabase {
    private static final String DATABASE_NAME="order_db";

    public abstract DaoOrder daoOrder();
    private static OrderDatabase instance;

    public static synchronized OrderDatabase getInstance(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(),OrderDatabase.class
                    ,DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
