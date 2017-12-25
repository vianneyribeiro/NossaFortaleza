package com.example.vianneyribeiro.nossafortaleza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppings);

        ListView listView = findViewById(R.id.listaShopping);

        ArrayList<String> shoppingLocal = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, shoppingLocal);
        listView.setAdapter(arrayAdapter);
    }

    private ArrayList<String> preencherDados() {
        ArrayList<String> dados = new ArrayList<>();
        dados.add(getString(R.string.shopping_centerUm));
        dados.add(getString(R.string.shopping_eusebio));
        dados.add(getString(R.string.shopping_Iguatemi));
        dados.add(getString(R.string.shopping_mercadao));
        dados.add(getString(R.string.shopping_RioMar));
        return dados;
    }
}
