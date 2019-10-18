package com.example.rooftop;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class show_details_atik extends AppCompatActivity {
    TextView title,owner,location,contact,description;
    String p_title,p_owner,p_location,p_contact,p_description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details_atik);
        title=(TextView)findViewById(R.id.title_id);
        owner=(TextView)findViewById(R.id.owner_id);
        location=(TextView)findViewById(R.id.location_id);
        contact=(TextView)findViewById(R.id.contact_id);
        description=(TextView)findViewById(R.id.description_id);

        p_title=getIntent().getExtras().getString("n_title");
        p_owner=getIntent().getExtras().getString("n_owner");
        p_location=getIntent().getExtras().getString("n_location");
        p_contact=getIntent().getExtras().getString("n_contact");
        p_description=getIntent().getExtras().getString("n_description");

        title.setText(p_title);
        owner.setText(p_owner);
        location.setText(p_location);
        contact.setText(p_contact);
        description.setText(p_description);

    }
}
