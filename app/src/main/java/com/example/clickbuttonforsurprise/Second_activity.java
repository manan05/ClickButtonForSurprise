package com.example.clickbuttonforsurprise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Second_activity extends AppCompatActivity {

    TextView tvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        tvOutput = findViewById(R.id.tvOutput);

        tvOutput.setText(getIntent().getStringExtra("myText"));


    }
}
