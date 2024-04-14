package com.example.listview;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    ArrayList<String> list= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        simpleList = findViewById(R.id.simpleListView);

        //adding items to the list

        list.add("pakistan");
        list.add("Lmao");
        list.add("yooooo");

        ArrayAdapter<String> arrayAdapter =  new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item, list);
        simpleList.setAdapter(arrayAdapter);

        // Set click listener for the ListView
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                switch(position) {
                    case 0:
                        Intent intent0 = new Intent(MainActivity.this, PakistanActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, lamoActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, YoooooActivity.class);
                        startActivity(intent2);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}