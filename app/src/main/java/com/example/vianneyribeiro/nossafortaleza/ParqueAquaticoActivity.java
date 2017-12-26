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
        arrayList.add(new LocalizationItem(R.drawable.beachpark, getString(R.string.parque_beachPark), getString(R.string.parque_beachPark_desc), getString(R.string.parque_beachpark_local)));
        arrayList.add(new LocalizationItem(R.drawable.ytacaranha, getString(R.string.parque_ytacaranha), getString(R.string.parque_ytacaranha_desc), getString(R.string.parque_ytacaranha_local)));

        ArrayAdapter adapter = new LocalizationAdapter(this, arrayList);
        listView.setAdapter(adapter);
    }
}
