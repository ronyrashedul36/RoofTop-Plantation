package com.example.rooftop;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class nursary_main_page_atik extends AppCompatActivity implements View.OnClickListener {
    myDatabaseHelper mydb;
    private EditText titleEditText,ownerEditText,locationEditText,contactEditText,descriptionEditText;
    private Button submitBtn,displayBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursary_main_page_atik);
        mydb=new myDatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase = mydb.getWritableDatabase();

        titleEditText=(EditText)findViewById(R.id.title_edit);
        ownerEditText=(EditText)findViewById(R.id.owner_edit);
        locationEditText=(EditText)findViewById(R.id.location_edit);
        contactEditText=(EditText)findViewById(R.id.contact_edit);
        descriptionEditText=(EditText)findViewById(R.id.description_edit);

        submitBtn=(Button)findViewById(R.id.submit_button);
        displayBtn=(Button)findViewById(R.id.display_button);

        submitBtn.setOnClickListener(this);
        displayBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        String title=titleEditText.getText().toString();
        String owner=ownerEditText.getText().toString();
        String location=locationEditText.getText().toString();
        String contact=contactEditText.getText().toString();
        String description=descriptionEditText.getText().toString();

        if(view.getId()==R.id.submit_button){
            long rowid;
            if(title!=null && owner!=null && location!=null && contact!=null && description!=null)
                rowid = mydb.insertData(title, owner, location, contact, description);
            else {
                rowid = -1;
                Toast.makeText(getApplicationContext(),"all fields must be filled",Toast.LENGTH_LONG).show();
            }
            if(rowid==-1){
                Toast.makeText(getApplicationContext(),"insertion unsuccessful",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Row is successfully inserted"+rowid,Toast.LENGTH_LONG).show();
            }
        }
        if(view.getId()==R.id.display_button){
            Intent intent=new Intent(nursary_main_page_atik.this,nursary_list_atik.class);
            startActivity(intent);
        }
    }

}
