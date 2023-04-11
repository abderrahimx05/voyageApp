package com.example.sicilylines2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class ModificationActivity extends AppCompatActivity {
     Button lister, deconnercter , modifier;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modification);
        lister = findViewById(R.id.button3);
        deconnercter = findViewById(R.id.deconnecter);
        modifier = findViewById(R.id.button2);
        deconnercter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ModificationActivity.this,MainActivity.class));

            }
        });
        modifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ModificationActivity.this , InformationActivity.class));
            }
        });
        lister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ModificationActivity.this, ReservationsActivity.class));
            }
        });


    }
}