package com.example.example_collection.Basic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.example_collection.R;

public class IntentActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.example_collection.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, IntentActivitySub.class);
        EditText editText_Intent = findViewById(R.id.editText_Intent);
        String message = editText_Intent.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}