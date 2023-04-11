package com.example.sicilylines2;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class InformationActivity extends AppCompatActivity {
    Button deconneter , valide ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        deconneter = findViewById(R.id.deconnecter);
        valide =  findViewById(R.id.valider);

        deconneter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformationActivity.this,MainActivity.class ));
            }
        });
        valide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformationActivity.this,ValidationActivity.class ));
            }
        });


    }
}