package com.example.listeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView mylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist=findViewById(R.id.listeview);
        //1- declare arraylist
        ArrayList<String > stringArrayList=new ArrayList<>();
        stringArrayList.add("janvier");
        stringArrayList.add("fevrier");
        stringArrayList.add("mars");
        stringArrayList.add("avril");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        stringArrayList.add("mai");
        //2-declare adapter
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,stringArrayList);
        mylist.setAdapter(adapter);


        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str= parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "item:"+str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}