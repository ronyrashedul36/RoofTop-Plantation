package com.example.rooftop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonId1,buttonId2,buttonId3,buttonId4,buttonId5,buttonId6,buttonId7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonId1 = findViewById(R.id.buttonId1);
        buttonId2 = findViewById(R.id.buttonId2);
        buttonId3 = findViewById(R.id.buttonId3);
        buttonId5 = findViewById(R.id.buttonId5);
        buttonId4 = findViewById(R.id.buttonId4);
        buttonId6 = findViewById(R.id.buttonId6);
        buttonId7 = findViewById(R.id.buttonId7);



        buttonId1.setOnClickListener(this);
        buttonId2.setOnClickListener(this);
        buttonId3.setOnClickListener(this);
        buttonId4.setOnClickListener(this);
        buttonId5.setOnClickListener(this);
        buttonId6.setOnClickListener(this);
        buttonId7.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.buttonId1) {
            Intent intent = new Intent(v.getContext(), chadBaganToiri.class);
            v.getContext().startActivity(intent);
        } else if(v.getId() == R.id.buttonId2) {
            Intent intent = new Intent(v.getContext(), ChadBaganModel.class);
            v.getContext().startActivity(intent);
        } else if(v.getId() == R.id.buttonId3) {
            Intent intent = new Intent(v.getContext(), DragDrop.class);
            v.getContext().startActivity(intent);
        }else if(v.getId() == R.id.buttonId4) {
            Intent intent = new Intent(v.getContext(), RogPokaMakorDomon.class);
            v.getContext().startActivity(intent);
        }else if(v.getId() == R.id.buttonId5) {
            Intent intent = new Intent(v.getContext(), Joibokrishi.class);
            v.getContext().startActivity(intent);
        }else if(v.getId() == R.id.buttonId6) {
            Intent intent = new Intent(v.getContext(), Developer.class);
            v.getContext().startActivity(intent);
        }else if(v.getId() == R.id.buttonId7) {
            Intent intent = new Intent(v.getContext(), nursary_main_page_atik.class);
            v.getContext().startActivity(intent);
        }


    }
}
