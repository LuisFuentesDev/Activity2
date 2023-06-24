package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListeners();
        Intent intentGet = getIntent();
        int idImagen = intentGet.getIntExtra("Clave",0);
        Log.d("secondActivity",String.valueOf(idImagen));

        ImageButton imageButton = findViewById(R.id.imageSecond);

        imageButton.setImageResource(idImagen);
    }

    private void initListeners() {
        Button back = findViewById(R.id.buttonBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }


}