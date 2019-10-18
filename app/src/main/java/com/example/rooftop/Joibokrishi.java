package com.example.rooftop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Joibokrishi extends AppCompatActivity implements View.OnClickListener{

    Button button5_1,button5_2,button5_3,button5_4,button5_5,button5_6,button5_7,button5_8,button5_9,button5_10,button5_11,button5_12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joibokrishi);

        button5_1 = findViewById(R.id.buttonId5_1);
        button5_2 = findViewById(R.id.buttonId5_2);
        button5_3 = findViewById(R.id.buttonId5_3);
        button5_4 = findViewById(R.id.buttonId5_4);
        button5_5 = findViewById(R.id.buttonId5_5);
        button5_6 = findViewById(R.id.buttonId5_6);
        button5_7 = findViewById(R.id.buttonId5_7);
        button5_8 = findViewById(R.id.buttonId5_8);
        button5_9 = findViewById(R.id.buttonId5_9);
        button5_10 = findViewById(R.id.buttonId5_10);
        button5_11 = findViewById(R.id.buttonId5_11);
        button5_12 = findViewById(R.id.buttonId5_12);

        button5_1.setOnClickListener(this);
        button5_2.setOnClickListener(this);
        button5_3.setOnClickListener(this);
        button5_4.setOnClickListener(this);
        button5_5.setOnClickListener(this);
        button5_6.setOnClickListener(this);
        button5_7.setOnClickListener(this);
        button5_8.setOnClickListener(this);
        button5_9.setOnClickListener(this);
        button5_10.setOnClickListener(this);
        button5_11.setOnClickListener(this);
        button5_12.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String res="";
        if(view.getId() == R.id.buttonId5_1) {
            res = getString(R.string.joiboKrishirDhanrona);
        } else if(view.getId() == R.id.buttonId5_2) {
            res = getString(R.string.adhunikKrishi);
        }else if(view.getId() == R.id.buttonId5_3) {
            res = getString(R.string.misSroCas);
        }else if(view.getId() == R.id.buttonId5_4) {
            res = getString(R.string.bisTop);
        }else if(view.getId() == R.id.buttonId5_5) {
            res = getString(R.string.feromonFad);
        }else if(view.getId() == R.id.buttonId5_6) {
           res = getString(R.string.joiboSar);
        }else if(view.getId() == R.id.buttonId5_7) {
            res = getString(R.string.balainasok);
        }else if(view.getId() == R.id.buttonId5_8) {
            res = getString(R.string.pesticides);
        }else if(view.getId() == R.id.buttonId5_9) {
            res = getString(R.string.athalofad);
        }else if(view.getId() == R.id.buttonId5_10) {
            res = getString(R.string.joiboKrishirDhanrona);
        }else if(view.getId() == R.id.buttonId5_11) {
            res = getString(R.string.joiboKrishirDhanrona);
        }else if(view.getId() == R.id.buttonId5_12) {
            res = getString(R.string.joiboKrishirDhanrona);
        }
        Intent starterIntent = new Intent(Joibokrishi.this,TextShow.class);
        starterIntent.putExtra("text_key",res);
        view.getContext().startActivity(starterIntent);
    }
}
