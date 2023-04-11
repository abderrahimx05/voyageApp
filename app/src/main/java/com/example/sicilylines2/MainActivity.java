package com.example.sicilylines2;

import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText  email,mdp;
    Button co;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email= findViewById(R.id.editTextTextPersonName);
        mdp= findViewById(R.id.editTextTextPassword2);
        co  =findViewById(R.id.connexion);
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = email.getText().toString();
                String password = mdp.getText().toString();
                if (username.length()==0 || password.length()==0){
                    Toast.makeText(getApplicationContext(),"il faut remplir les champs requires",Toast.LENGTH_SHORT).show();

                }
                else {

                     startActivity(new Intent(MainActivity.this, ModificationActivity.class));
                    Toast.makeText(getApplicationContext(),"il faut remplir les champs requires",Toast.LENGTH_SHORT).show();



                }
            }
        });


    }
}