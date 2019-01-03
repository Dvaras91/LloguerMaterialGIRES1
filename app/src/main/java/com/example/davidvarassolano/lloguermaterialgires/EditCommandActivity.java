package com.example.davidvarassolano.lloguermaterialgires;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class EditCommandActivity extends AppCompatActivity {
    Intent intent;
    TextView Nomcomanda;
    String nomcomanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_command);
        Nomcomanda = findViewById(R.id.lbl_nomcomanda);
        intent = getIntent();
        if (intent != null){
            nomcomanda = intent.getStringExtra("name");
            Nomcomanda.setText("Nom de la comanda: " +nomcomanda);
        }



    }

}
