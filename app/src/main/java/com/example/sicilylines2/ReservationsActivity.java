package com.example.sicilylines2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class ReservationsActivity extends AppCompatActivity {
     Button retour , deconnecter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservations);
        deconnecter = findViewById(R.id.deconnecter);
        retour = findViewById(R.id.retourr);
        deconnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ReservationsActivity.this,MainActivity.class ));
            }
        });
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ReservationsActivity.this,ModificationActivity.class ));
            }
        });

    }
}