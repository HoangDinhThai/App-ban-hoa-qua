package com.example.app_ban_hoa_qua.Activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_ban_hoa_qua.Database.AccountDatabase;
import com.example.app_ban_hoa_qua.Entity.Account;
import com.example.app_ban_hoa_qua.R;

import java.util.List;

public class ListAccActivity extends AppCompatActivity {
    ListView mlistView;
    Context context;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_acc);
        mlistView = findViewById(R.id.list);
        AccountDatabase database = AccountDatabase.getInstance(getApplicationContext());
        List<Account> accounts = database.daoAccount().ACCOUNT_LIST();
    }
}
