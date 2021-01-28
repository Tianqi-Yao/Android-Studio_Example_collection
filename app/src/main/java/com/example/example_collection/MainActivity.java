package com.example.example_collection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.example_collection.Basic.ButtonActivity;
import com.example.example_collection.Basic.IntentActivity;
import com.example.example_collection.ListView.ListViewActivity;
import com.example.example_collection.RecycleView.RecycleViewActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 跳转到按钮事件页面
         */
        Button btn_toButtonActivity = findViewById(R.id.btn_toButtonActivity);
        btn_toButtonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });

        /**
         * 跳转到意图事件页面
         */
        Button btn_toIntentActivity = findViewById(R.id.btn_toIntentActivity);
        btn_toIntentActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(intent);
            }
        });

        /**
         * 跳转到ListView页面
         */
        Button btn_toListViewActivity = findViewById(R.id.btn_toListViewActivity);
        btn_toListViewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        /**
         * 跳转到RecycleView
         */
        Button btn_toRecycleView = findViewById(R.id.btn_toRecycleView);
        btn_toRecycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecycleViewActivity.class);
                startActivity(intent);
            }
        });


    }
}