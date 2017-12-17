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
        arrayList.add(new LocalizationItem(R.drawable.praiadeiracema, "Praia de Iracema", "As águas claras da praia de Iracema são poluídas, mas seu calçadão está sempre cheio de gente correndo, caminhando ou apenas contemplando o mar de ondas fortes. A grande quantidade de bares e de restaurantes garante burburinho dia e noite, mas é à tardinha que o movimento aumenta, principalmente na Ponte Metálica (ou dos Ingleses), uma plataforma que avança mar adentro e local perfeito para se despedir do sol.", "6 Km do Centro"));
        arrayList.add(new LocalizationItem(R.drawable.praiadofuturolowres, "Praia do Futuro", "Preferida dos banhistas, a praia do Futuro ocupa oito dos 25 quilômetros da orla da capital,com direito a areias fofas e claras, ondas fortes e dunas. Limpa e bonita, abriga ao longo de seu calçadão diversas barracas que oferecem duchas de água doce, cadeiras de praia e delícias da gastronomia regional. ", "11 Km do Centro"));
        arrayList.add(new LocalizationItem(R.drawable.praiameireleslowres, "Praia do Meireles", "Bastante familiar, a praia de Meireles é arborizada, tem calçadões, feira de artesanato e quadra de esportes. O movimento de turistas é grande, uma vez que a maioria dos hotéis está por lá. Com formações rochosas e mar poluído, não é indicada para banhos.", "10 Km do Centro"));
        arrayList.add(new LocalizationItem(R.drawable.praiamucuripelowres, "Praia do Mucuripe", "A tranquila enseada de Mucuripe é reduto da comunidade caiçara em pleno centro urbano. Tem areias claras e fofas, coqueiros, quadras de esportes e muitas jangadas que lá aportam repletas de lagostas. Um bom programa no final da tarde é beliscar nas barracas do Mercado do Peixe, onde estão os pescados mais frescos de Fortaleza.", "15 Km do Centro"));

        ArrayAdapter adapter = new LocalizationAdapter(this, arrayList);
        listView.setAdapter(adapter);

    }
}
