package com.example.shantanu.opus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void companyLogin(View view){

        Intent intent = new Intent(this, companyLoginActivity.class);
        startActivity(intent);

    }

    public void individualLogin(View view){

        Intent intent = new Intent(this, individualLoginActivity.class);
        startActivity(intent);

    }

    public void adminLogin(View view){

        Intent intent = new Intent(this, sysAdminLoginActivity.class);
        startActivity(intent);

    }
}
