package com.example.listscrollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] shopnames;
    String[] descriptions;
    int images[] = {R.drawable.ans1, R.drawable.ans2, R.drawable.atempo, R.drawable.bbbsheep, R.drawable.cafedelight, R.drawable.censquare, R.drawable.crave};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.myListView);
        Resources res = getResources();
        shopnames = res.getStringArray(R.array.shopnames);
        descriptions = res.getStringArray(R.array.descriptions);

        ListAdapter adapter = new ListAdapter(this, shopnames, descriptions, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent showDetailActivity = new Intent(getApplicationContext(), DetailActivity.class);
                showDetailActivity.putExtra("com.example.SOMETHING", "HELLO WORLD!");
                startActivity(showDetailActivity); //switches screen
            }
        });
    }
}
