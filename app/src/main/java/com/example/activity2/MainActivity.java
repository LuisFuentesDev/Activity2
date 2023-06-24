package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int imagen1 = R.drawable.calculator_technology_svgrepo_com;
    int imagen2 = R.drawable.ic_launcher_foreground;
    int imagen3 = R.drawable.noun_account;
    int imagen4 = R.drawable.noun_hacker_5276638;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {
        ImageButton button1 = findViewById(R.id.buttonStar);
        ImageButton button2 = findViewById(R.id.buttonAndroid);
        ImageButton button3 = findViewById(R.id.buttonCheck);
        ImageButton button4 = findViewById(R.id.buttonStarSilver);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondActivity(imagen1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondActivity(imagen2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondActivity(imagen3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondActivity(imagen4);
            }
        });
    }

    public void moveToSecondActivity(int img) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Clave", img);
        startActivity(intent);

    }


}