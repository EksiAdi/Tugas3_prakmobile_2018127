package com.example.pertemuan3_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void menu1(View view) {
        Intent a = new Intent(MainActivity.this, fregment1.class);
        startActivity(a);
    }
    public void menu2(View view) {
        Intent a = new Intent(MainActivity.this, fregment2.class);
        startActivity(a);
    }
    public void menu3(View view) {
        Intent a = new Intent(MainActivity.this, fregment3.class);
        startActivity(a);
    }
    public void menu4(View view) {
        Intent a = new Intent(MainActivity.this, fregment4.class);
        startActivity(a);
    }
}