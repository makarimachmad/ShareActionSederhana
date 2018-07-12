package com.example.witono.shareaction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button berbagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        berbagi = findViewById(R.id.buttonbagi);
        berbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentberbagi = new Intent(Intent.ACTION_SEND);
                intentberbagi.setType("set/type");

                String berbagiobjek="Silahkan pilh";
                String berbagisubjek="Ke siapa";

                intentberbagi.putExtra(Intent.EXTRA_SUBJECT,berbagiobjek);
                intentberbagi.putExtra(Intent.EXTRA_TEXT,berbagiobjek);
                startActivity(Intent.createChooser(intentberbagi,"Bagi Menggunakan"));
            }
        });
    }
}
