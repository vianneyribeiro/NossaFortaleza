package com.example.vianneyribeiro.nossafortaleza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PraiasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praias);

        ListView listView = findViewById(R.id.listPraias);

        ArrayList<LocalizationItem> arrayList = new ArrayList<>();
        arrayList.add(new LocalizationItem(R.drawable.praia_de_iracema, getString(R.string.praia_de_iracema), getString(R.string.desc_praia_de_iracema), getString(R.string.local_praia_do_mucuripe)));
        arrayList.add(new LocalizationItem(R.drawable.praia_do_futuro, getString(R.string.praia_do_futuro), getString(R.string.desc_praia_do_futuro), getString(R.string.local_praia_do_futuro)));
        arrayList.add(new LocalizationItem(R.drawable.praia_do_meireles, getString(R.string.praia_do_meireles), getString(R.string.desc_praia_do_meireles), getString(R.string.local_praia_do_meireles)));
        arrayList.add(new LocalizationItem(R.drawable.praia_do_mucuripe, getString(R.string.praia_do_mucuripe), getString(R.string.desc_praia_do_mucuripe), getString(R.string.local_praia_do_mucuripe)));

        ArrayAdapter adapter = new LocalizationAdapter(this, arrayList);
        listView.setAdapter(adapter);

    }
}
