package com.example.boo.apimvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.boo.apimvp.city.CitiesView;
import com.example.boo.apimvp.people.PersonView;

public class MainActivity extends AppCompatActivity {
    Button toPeopleButton;
    Button toCitiesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toPeopleButton = (Button) findViewById(R.id.main_to_people);
        toPeopleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PersonView.class));
            }
        });

        toCitiesButton = (Button) findViewById(R.id.main_to_cities);
        toCitiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CitiesView.class));
            }
        });
    }


}
