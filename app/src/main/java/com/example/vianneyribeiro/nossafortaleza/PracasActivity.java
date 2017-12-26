package com.example.vianneyribeiro.nossafortaleza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PracasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pracas);

        ListView listView = findViewById(R.id.listaPracas);

        ArrayList<String> pracasLocal = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pracasLocal);
        listView.setAdapter(arrayAdapter);
    }

    private ArrayList<String> preencherDados() {
        ArrayList<String> dados = new ArrayList<>();
        dados.add(getString(R.string.praca_dos_leoes));
        dados.add(getString(R.string.praca_joao_tome));
        dados.add(getString(R.string.praca_lagamar));
        dados.add(getString(R.string.praca_luiza_tavora));
        dados.add(getString(R.string.praca_messejana));
        return dados;
    }
}
