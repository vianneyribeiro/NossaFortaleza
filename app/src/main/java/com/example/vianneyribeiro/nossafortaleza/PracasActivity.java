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

        ListView listView = (ListView) findViewById(R.id.listaPracas);

        ArrayList<String> pracasLocal = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pracasLocal);
        listView.setAdapter(arrayAdapter);

    }

    private ArrayList<String> preencherDados() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Pracinha do Lagamar");
        dados.add("Praça da Messejana");
        dados.add("Praça Luiza Távora");
        dados.add("Praça dos Leões");
        dados.add("Praça Eng. João Tomé");
        return dados;
    }
}
