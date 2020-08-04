package com.example.coderspot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Folder> {
    private final Context context;
    private final ArrayList<Folder> values;

    public Adapter(Context context, ArrayList<Folder> list) {
        super(context, R.layout.custom_layout,list);
        this.context = context;
        this.values = list;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View custom = inflater.inflate(R.layout.custom_layout,parent,false);
        TextView text= custom.findViewById(R.id.textView);
        ImageView imageView=custom.findViewById(R.id.imageView);

        text.setText(values.get(position).getText());
        imageView.setImageResource(R.drawable.folder);





        return custom;


    }
}

