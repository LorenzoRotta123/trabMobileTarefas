package com.example.tabelas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FloatingActionButton fab = findViewById(R.id.btLogar);
        FloatingActionButton fab2 = findViewById(R.id.btCriarConta2);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), MainActivity.class);

                    startActivity(i);
                }
            });

            fab2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(v.getContext(), criarConta.class);

                    startActivity(i2);
                }
            });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
