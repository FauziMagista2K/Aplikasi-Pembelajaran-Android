package com.example.aplikasimobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TriktrikActivity extends AppCompatActivity {
    public TextView btntrikmateri, btntrikvideo;
    public ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triktrik);
        btntrikmateri = findViewById(R.id.btntrikmateri);
        btntrikvideo = findViewById(R.id.btntrikvideo);


        btntrikmateri.setOnClickListener(v -> {
            Intent intent = new Intent(TriktrikActivity.this, TrikMateriActivity.class);
            startActivity(intent);
        });
       btntrikvideo.setOnClickListener(v -> {
            Intent intent = new Intent(TriktrikActivity.this, VideoActivity.class);
            startActivity(intent);
        });

    }
}