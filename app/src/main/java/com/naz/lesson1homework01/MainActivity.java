package com.naz.lesson1homework01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView01 = findViewById(R.id.text_view01);
        EditText editText01 = findViewById(R.id.edit_text01);
        Button button01 = findViewById(R.id.button01);
        Switch switch01 = findViewById(R.id.switch01);
        CheckBox checkBox01 = findViewById(R.id.check_box);
        ToggleButton toggleButton01 = findViewById(R.id.toggle_button01);

        textView01.setTextColor(Integer.parseInt("#221100"));
        textView01.setText("Hi, GeekBrains!");

    }
}