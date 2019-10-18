package com.example.rooftop;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class nursary_list_atik extends AppCompatActivity {
    private ListView listView;
    private myDatabaseHelper my_db_helper;
    Cursor cursor;

    //  person[] personArray = new person[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursary_list_atik);
        listView=(ListView)findViewById(R.id.nersury_list_id);
        my_db_helper=new myDatabaseHelper(this);
        load_data();
    }
    public void load_data(){
        final ArrayList<String> data_list=new ArrayList<>();
        cursor=my_db_helper.displayAllData();
        if(cursor.getCount()==0){
            Toast.makeText(getApplicationContext(),"No Data is Found",Toast.LENGTH_LONG).show();
        }
        else {
            while (cursor.moveToNext()){

                try{
                    String title=cursor.getString(1);
                    String location=cursor.getString(3);

                    data_list.add(title+ "--" +location);
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),e + "Data can not enter into student_array from cursor",Toast.LENGTH_LONG).show();
                }

            }
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.show_list,R.id.text_view_id,data_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String title,owner,location,contact,description;

                cursor.moveToPosition(i);

                title=cursor.getString(1);
                owner=cursor.getString(2);
                location=cursor.getString(3);
                contact=cursor.getString(4);
                description=cursor.getString(5);

                Intent intent=new Intent(nursary_list_atik.this,show_details_atik.class);
                intent.putExtra("n_title",title);
                intent.putExtra("n_owner",owner);
                intent.putExtra("n_location",location);
                intent.putExtra("n_contact",contact);
                intent.putExtra("n_description",description);

                startActivity(intent);
            }
        });
    }

}
