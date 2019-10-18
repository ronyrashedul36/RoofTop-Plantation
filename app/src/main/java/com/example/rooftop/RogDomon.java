package com.example.rooftop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RogDomon extends AppCompatActivity implements View.OnClickListener{

    Button button4_2_1,button4_2_2,button4_2_3,button4_2_4,button4_2_5,button4_2_6,button4_2_7,button4_2_8,button4_2_9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rog_domon);

        button4_2_1 = findViewById(R.id.buttonId4_2_1);
        button4_2_2 = findViewById(R.id.buttonId4_2_2);
        button4_2_3 = findViewById(R.id.buttonId4_2_3);
        button4_2_4 = findViewById(R.id.buttonId4_2_4);
        button4_2_5 = findViewById(R.id.buttonId4_2_5);
        button4_2_6 = findViewById(R.id.buttonId4_2_6);
        button4_2_7 = findViewById(R.id.buttonId4_2_7);
        button4_2_8 = findViewById(R.id.buttonId4_2_8);
        button4_2_9 = findViewById(R.id.buttonId4_2_9);

        button4_2_1.setOnClickListener(this);
        button4_2_2.setOnClickListener(this);
        button4_2_3.setOnClickListener(this);
        button4_2_4.setOnClickListener(this);
        button4_2_5.setOnClickListener(this);
        button4_2_6.setOnClickListener(this);
        button4_2_7.setOnClickListener(this);
        button4_2_8.setOnClickListener(this);
        button4_2_9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String res="";
        if(v.getId() == R.id.buttonId4_2_1) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_2_2) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_2_3) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_2_4) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_2_5) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_2_6) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_2_7) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_2_8) {
            res = getString(R.string.adhunikKrishi);
        }else if(v.getId() == R.id.buttonId4_2_9) {
            res = getString(R.string.adhunikKrishi);
        }
        Intent starterIntent = new Intent(RogDomon.this,TextShow.class);
        starterIntent.putExtra("text_key",res);
        v.getContext().startActivity(starterIntent);
    }
}
