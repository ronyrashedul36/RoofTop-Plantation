package com.example.rooftop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PokaMakorDomon extends AppCompatActivity implements View.OnClickListener{

    Button button4_1_1,button4_1_2,button4_1_3,button4_1_4,button4_1_5,button4_1_6,button4_1_7,button4_1_8,button4_1_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poka_makor_domon);

        button4_1_1 = findViewById(R.id.buttonId4_1_1);
        button4_1_2 = findViewById(R.id.buttonId4_1_2);
        button4_1_3 = findViewById(R.id.buttonId4_1_3);
        button4_1_4 = findViewById(R.id.buttonId4_1_4);
        button4_1_5 = findViewById(R.id.buttonId4_1_5);
        button4_1_6 = findViewById(R.id.buttonId4_1_6);
        button4_1_7 = findViewById(R.id.buttonId4_1_7);
        button4_1_8 = findViewById(R.id.buttonId4_1_8);
        button4_1_9 = findViewById(R.id.buttonId4_1_9);

        button4_1_1.setOnClickListener(this);
        button4_1_2.setOnClickListener(this);
        button4_1_3.setOnClickListener(this);
        button4_1_4.setOnClickListener(this);
        button4_1_5.setOnClickListener(this);
        button4_1_6.setOnClickListener(this);
        button4_1_7.setOnClickListener(this);
        button4_1_8.setOnClickListener(this);
        button4_1_9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String res="";
        if(v.getId() == R.id.buttonId4_1_1) {
            res = getString(R.string.joiboKrishirDhanrona);
        }else if(v.getId() == R.id.buttonId4_1_2) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_1_3) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_1_4) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_1_5) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_1_6) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_1_7) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_1_8) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_1_9) {
            res = getString(R.string.adhunikKrishi);
        }
        Intent starterIntent = new Intent(PokaMakorDomon.this,TextShow.class);
        starterIntent.putExtra("text_key",res);
        v.getContext().startActivity(starterIntent);
    }
}
