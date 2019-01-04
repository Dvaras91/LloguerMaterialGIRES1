package com.example.davidvarassolano.lloguermaterialgires;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

public class InformationComandActivity extends AppCompatActivity {

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    Intent intent;
    TextView Nomcomanda;
    String nomcomanda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_comand);
        Nomcomanda = findViewById(R.id.lbl_nom);
        intent = getIntent();
        if (intent!=null){
            nomcomanda = intent.getStringExtra("name");
            Nomcomanda.setText(nomcomanda);
        }
    }

    public void ReturnNormalUser(View view) {
        finish();
    }
}
