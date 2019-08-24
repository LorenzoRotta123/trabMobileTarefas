package com.example.tabelas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FloatingActionButton fab = findViewById(R.id.btSalvar);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), MainActivity.class);

                    startActivity(i);
                }
            });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }
}
