package com.example.nodnod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_screen extends AppCompatActivity {

    Button today;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        // untuk kalo nge klik tombol login
        today = findViewById(R.id.today);
        today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_screen.this,MainActivity.class));
            }
        });
    }
}
