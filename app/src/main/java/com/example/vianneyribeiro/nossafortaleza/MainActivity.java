package com.example.vianneyribeiro.nossafortaleza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnArtesanato = findViewById(R.id.artesanato);
        btnArtesanato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artesanatoIntent = new Intent(MainActivity.this, ArtesanatoActivity.class);
                startActivity(artesanatoIntent);
            }
        });


        Button btnShoppings = findViewById(R.id.shoppings);
        btnShoppings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoppingsIntent = new Intent(MainActivity.this, ShoppingsActivity.class);
                startActivity(shoppingsIntent);
            }
        });

        Button btnPracas = findViewById(R.id.pracas);
        btnPracas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pracasIntent = new Intent(MainActivity.this, PracasActivity.class);
                startActivity(pracasIntent);
            }
        });


        Button btnParques = findViewById(R.id.parqueslivres);

        btnParques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parqueintent = new Intent(getApplicationContext(), ParqueAquaticoActivity.class);
                startActivity(parqueintent);
            }
        });

        Button btnPraias = findViewById(R.id.praias);

        btnPraias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PraiasActivity.class);
                startActivity(intent);
            }
        });


    }
}
