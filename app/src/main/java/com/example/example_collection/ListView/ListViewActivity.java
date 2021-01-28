package com.example.example_collection.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.example_collection.R;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.listView);

        String newName = null;
        int newAge;
        ArrayList<Person> personArrayList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            newName = "Name_" + i;
            newAge = i;
            Person person = new Person(newName,newAge);
            personArrayList.add(person);
        }

        /*Log.e("TEST", "onCreate: ");
        Log.e("TEST", Integer.toString(personArrayList.size()));

        for (int i = 0; i < personArrayList.size(); i++) {
            Log.e("TEST", personArrayList.get(i).getNewName());
            Log.e("TEST", Integer.toString(personArrayList.get(i).getNewAge()));
        }*/
        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout,personArrayList);
        listView.setAdapter(adapter);
    }
}