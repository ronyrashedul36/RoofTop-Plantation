package com.example.rooftop;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextShow extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_show);

        textView = findViewById(R.id.txt);
        String text = getIntent().getStringExtra("text_key");
        textView.setText(text);
    }
}
