package com.example.listeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=findViewById(R.id.listview2);
        ArrayList<User> arrayList= new ArrayList();
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.facebook1));
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.facebook1));
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.image1));
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.image1));
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.image1));
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.donate1));
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.donate1));
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.donate1));
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.donate1));
        arrayList.add(new User("abir","bonjour tout monde",R.drawable.facebook1));
        AdapterClass adapter=new AdapterClass(ListActivity.this,arrayList);
        listView.setAdapter(adapter);

    }
}