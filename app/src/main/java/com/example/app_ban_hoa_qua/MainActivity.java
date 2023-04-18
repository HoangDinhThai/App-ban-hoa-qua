package com.example.app_ban_hoa_qua;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.util.Log;

import com.example.app_ban_hoa_qua.Database.AccountDatabase;
import com.example.app_ban_hoa_qua.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText mEdt_user;
    private EditText mEdt_pass;
    private Button mbtn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtn_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                login();
            }
        });

    }

    private void login(){
        SharedPreferences preferences =MainActivity.this.getSharedPreferences("login",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        String user = mEdt_user.getText().toString();
        String pass = mEdt_pass.getText().toString();

        AccountDatabase database = AccountDatabase.getInstance(getApplicationContext());
        List<Account> accountList = database.daoAccount().ACCOUNT_LIST();

        String us = null;
        String ps = null;

    }
}