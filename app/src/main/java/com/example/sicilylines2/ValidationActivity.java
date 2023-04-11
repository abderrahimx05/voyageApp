package com.example.sicilylines2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class ValidationActivity extends AppCompatActivity {
    Button deconnecter , retour ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
        deconnecter = findViewById(R.id.deconnecter);
        retour =  findViewById(R.id.retour);
        deconnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ValidationActivity.this,MainActivity.class ));
            }
        });
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ValidationActivity.this,ModificationActivity.class ));
            }
        });


    }
}