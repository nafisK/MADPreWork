package com.example.madandroiddevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Changes Text Color
        findViewById(R.id.btnChangeTextColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.tvTitle)).setTextColor(getResources().getColor(R.color.black));
            }
        });

        // Changes Background Color
        findViewById(R.id.btnChangeBackgroundColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                (findViewById(R.id.clParent)).setBackgroundColor(getResources().getColor(R.color.LightColor_9));
            }
        });

        // Change Title Text
        findViewById(R.id.btnChangeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = ((EditText) findViewById(R.id.etChangeTitle)).getText().toString();
                if (txt.isEmpty())
                    ((TextView) findViewById(R.id.tvTitle)).setText("TESTING APP");
                else {
                    ((TextView) findViewById(R.id.tvTitle)).setText(txt);
                    ((EditText) findViewById(R.id.etChangeTitle)).setText("");
                }
            }
        });

        // Reset All Effects
        findViewById(R.id.btnReset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.tvTitle)).setTextColor(getResources().getColor(R.color.white));
                (findViewById(R.id.clParent)).setBackgroundColor(getResources().getColor(R.color.LightColor_7));
                ((TextView) findViewById(R.id.tvTitle)).setText("TESTING APP");
            }
        });



    }
}