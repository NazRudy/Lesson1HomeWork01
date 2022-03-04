package com.naz.lesson1homework01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText editText = findViewById(R.id.edit_text);
        EditText editTextPersonName = findViewById(R.id.edit_textPersonName);
        EditText editPhone = findViewById(R.id.edit_phone);
        EditText editNumber = findViewById(R.id.edit_number);
        EditText editTextPassword = findViewById(R.id.edit_textPassword);
        EditText editTextEmailAddress = findViewById(R.id.edit_textEmailAddress);
        EditText editNumberPassword = findViewById(R.id.edit_numberPassword);
        EditText editDate = findViewById(R.id.edit_date);
        EditText editTextLongMessage = findViewById(R.id.edit_textLongMessage);
        EditText editTime = findViewById(R.id.time);
    }
}