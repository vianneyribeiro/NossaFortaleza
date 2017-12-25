package com.example.vianneyribeiro.nossafortaleza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ParqueAquaticoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_aquatico);

        ListView listView = findViewById(R.id.listaParqueAquatico);

        ArrayList<LocalizationItem> arrayList = new ArrayList<>();
        arrayList.add(new LocalizationItem(R.drawable.beachpark, "Beach Park", "Beach Park é um complexo turístico do litoral do Nordeste do Brasil, na praia de Porto das Dunas", "16 Km de Fortaleza"));
        arrayList.add(new LocalizationItem(R.drawable.ytacaranha, "Ytacaranha Park", "O Ytacaranha Park é um complexo turístico que dispõe de um maravilhoso parque aquático e um confortável Hotel de Praia", "220 Km de Fortaleza"));

        ArrayAdapter adapter = new LocalizationAdapter(this, arrayList);
        listView.setAdapter(adapter);
    }
}
