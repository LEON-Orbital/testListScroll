package com.example.listscrollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getIntent().hasExtra("com.example.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.secondText);
            String text = getIntent().getExtras().getString("com.example.SOMETHING");
            tv.setText(text);
        }
    }
}
