package com.example.rooftop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class chadBaganToiri extends AppCompatActivity implements View.OnClickListener{

    Button button1_1,button1_2,button1_3,button1_4,button1_5,button1_6,button1_7,button1_8,button1_9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chad_bagan_toiri);
        button1_1 = findViewById(R.id.buttonId1_1);
        button1_2 = findViewById(R.id.buttonId1_2);
        button1_3 = findViewById(R.id.buttonId1_3);
        button1_4 = findViewById(R.id.buttonId1_4);
        button1_5 = findViewById(R.id.buttonId1_5);
        button1_6 = findViewById(R.id.buttonId1_6);
        button1_7 = findViewById(R.id.buttonId1_7);
        button1_8 = findViewById(R.id.buttonId1_8);
        button1_9 = findViewById(R.id.buttonId1_9);
        button1_1.setOnClickListener(this);
        button1_2.setOnClickListener(this);
        button1_3.setOnClickListener(this);
        button1_4.setOnClickListener(this);
        button1_5.setOnClickListener(this);
        button1_6.setOnClickListener(this);
        button1_7.setOnClickListener(this);
        button1_8.setOnClickListener(this);
        button1_9.setOnClickListener(this);




    }
    public void onClick(View view) {

        String res="";
        if(view.getId() == R.id.buttonId1_1) {
            res = getString(R.string.adhunikKrishi);
        } else if(view.getId() == R.id.buttonId1_2) {
            res = getString(R.string.adhunikKrishi);
        }else if(view.getId() == R.id.buttonId1_3) {
            res = getString(R.string.adhunikKrishi);
        }else if(view.getId() == R.id.buttonId1_4) {
            res = getString(R.string.adhunikKrishi);
        }else if(view.getId() == R.id.buttonId1_5) {
            res = getString(R.string.adhunikKrishi);
        }else if(view.getId() == R.id.buttonId1_6) {
            res = getString(R.string.adhunikKrishi);
        }else if(view.getId() == R.id.buttonId1_7) {
            res = getString(R.string.adhunikKrishi);
        }else if(view.getId() == R.id.buttonId1_8) {
            res = getString(R.string.adhunikKrishi);
        }else if(view.getId() == R.id.buttonId1_9) {
            res = getString(R.string.adhunikKrishi);
        }
        Intent starterIntent = new Intent(chadBaganToiri.this,TextShow.class);
        starterIntent.putExtra("text_key",res);
        view.getContext().startActivity(starterIntent);

    }
}
