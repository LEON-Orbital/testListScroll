package com.example.listscrollapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<String> {

    Context context;
    String[] shopnames;
    String[] descriptions;
    int Imgs[];
    LayoutInflater mInflater;

    public ListAdapter(Context c, String[] i, String[] d, int imgs[]) {
        super(c, R.layout.list_item, R.id.tvTitle, i);
        this.context = c;
        this.shopnames = i;
        this.descriptions = d;
        this.Imgs = imgs;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.list_item, parent, false);
        TextView tvTitle = v.findViewById(R.id.tvTitle);
        TextView tvDesc = v.findViewById(R.id.tvDesc);
        ImageView ivPhoto = v.findViewById(R.id.ivPhoto);

        String title = shopnames[position];
        String desc = descriptions[position];

        ivPhoto.setImageResource(Imgs[position]);
        tvTitle.setText(title);
        tvDesc.setText(desc);

        return v;
    }
}
