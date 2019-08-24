package com.example.tabelas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FloatingActionButton fab = findViewById(R.id.btMais);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), tela2.class);

                    startActivity(i);
                }
            });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    };


