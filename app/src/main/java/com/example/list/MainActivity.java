package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;
//String[] list ={"1","2","3","4","5"};
    String [] list2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.ListView);

        list2 = getResources().getStringArray(R.array.number);

        ArrayAdapter ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list2);
        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String Value = ad.getItem(i).toString();
                Toast.makeText(getApplicationContext(),Value,Toast.LENGTH_SHORT).show();
            }
        });
    }
}