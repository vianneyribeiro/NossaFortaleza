package com.example.vianneyribeiro.nossafortaleza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtesanatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artesanato);

        ListView listView = findViewById(R.id.listaArtesanato);

        ArrayList<LocalizationItem> arrayList = new ArrayList<>();
        arrayList.add(new LocalizationItem(R.drawable.artesanato_luiza_tavora, getString(R.string.ceart), getString(R.string.desc_ceart), getString(R.string.local_ceart)));
        arrayList.add(new LocalizationItem(R.drawable.centro_de_turismo_ceara, getString(R.string.emcetur), getString(R.string.desc_emcetur), getString(R.string.local_emcetur)));
        arrayList.add(new LocalizationItem(R.drawable.mercado_central_fortaleza, getString(R.string.mCentralFortaleza), getString(R.string.desc_mCentralFortaleza), getString(R.string.local_mCentralFortaleza)));
        arrayList.add(new LocalizationItem(R.drawable.feira_beiramar, getString(R.string.fBeiraMar), getString(R.string.desc_fBeiraMar), getString(R.string.local_fBeiraMar)));

        ArrayAdapter adapter = new LocalizationAdapter(this, arrayList);
        listView.setAdapter(adapter);
    }
}
