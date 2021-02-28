package com.example.listeproject;

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
import java.util.List;

public class AdapterClass extends ArrayAdapter<User> {
    private TextView user_name,user_message;
    private ImageView image;
    public AdapterClass(@NonNull Context context, @NonNull ArrayList<User> objects) {
        super(context, R.layout.modele_item, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // view houwa item mba3ed tarkiba mta3ou==lil variable convertview
        //position houwa position mta3 item fil list view ==position mta3 donnee fil arraylist
        //parent== listview

        //1-tarkibet convertview bech na3ti convertview lil xml
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.modele_item,parent,false);
        //2-bech na3mel fiendview
        user_name=convertView.findViewById(R.id.user_name);
        user_message=convertView.findViewById(R.id.user_message);
        image=convertView.findViewById(R.id.imageView);
        //3-wa9teli position item ==position arraylist
        User user=getItem(position);
        //4-bech n3abi modele
        user_name.setText(user.getName());
        user_message.setText(user.getMsg());
        image.setImageResource(user.getImage());
        //5-traja3 view eli enti rakabtou
        return convertView;

    }
}
