package com.example.rooftop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RogPokaMakorDomon extends AppCompatActivity implements View.OnClickListener{
    Button button4_1,button4_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rog_poka_makor_domon);

        button4_1 = findViewById(R.id.buttonId4_1);
        button4_2 = findViewById(R.id.buttonId4_2);

        button4_1.setOnClickListener(this);
        button4_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonId4_1) {
            Intent intent = new Intent(v.getContext(), PokaMakorDomon.class);
            v.getContext().startActivity(intent);
        } else if(v.getId() == R.id.buttonId4_2) {
            Intent intent = new Intent(v.getContext(), RogDomon.class);
            v.getContext().startActivity(intent);
        }
    }
}
