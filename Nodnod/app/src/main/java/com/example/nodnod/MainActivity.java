package com.example.nodnod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    String[] s1;
    String[] s2;
    String[] s3;
    String[] s4;
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerview);

        s1 = getResources(). getStringArray(R.array.list_tugas);
        s2 = getResources(). getStringArray(R.array.tanggal);
        s3 = getResources(). getStringArray(R.array.status);
        s4 = getResources(). getStringArray(R.array.deskripsi);


        Context ct;
        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, s4);
        recyclerview.setAdapter(myAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

    }
}