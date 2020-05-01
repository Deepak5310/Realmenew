package com.deedeveloper.realmext;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.deedeveloper.realmext.categories.CromActivity;
import com.deedeveloper.realmext.categories.FifthActivity;
import com.deedeveloper.realmext.categories.ForthActivity;
import com.deedeveloper.realmext.categories.GcamActivity;
import com.deedeveloper.realmext.categories.SixthActivity;
import com.deedeveloper.realmext.categories.StockRom;


public class MainActivity extends AppCompatActivity {

    FrameLayout stockRom, customRom, gCam, forth, fifth, sixth;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //stockRom onClick Listener
        stockRom = findViewById(R.id.stockrom);
        stockRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StockRom.class);
                startActivity(intent);
            }
        });
        //customRom onClick Listener
        customRom = findViewById(R.id.customrom);
        customRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CromActivity.class);
                startActivity(intent);
            }
        });
        //gCam onClick Listener
        gCam = findViewById(R.id.gcam);
        gCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GcamActivity.class);
                startActivity(intent);
            }
        });
        //Forth onClick Listener
        forth = findViewById(R.id.forthbtn);
        forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForthActivity.class);
                startActivity(intent);
            }
        });
        //Fifth onClick Listener
        fifth = findViewById(R.id.fifthbtn);
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });
        //Sixth onClick Listener
        sixth = findViewById(R.id.sixthbtn);
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SixthActivity.class);
                startActivity(intent);
            }
        });
    }
}
