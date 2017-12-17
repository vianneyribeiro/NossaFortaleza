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
        arrayList.add(new LocalizationItem(R.drawable.artesanato_luiza_tavora_lowres, "Central de Artesanato do Ceará - CeArt", "Atualmente, a Central de Artesanato do Ceará (Ceart) conta com cerca de 42 mil artesãos cadastrados. O público-alvo da Ceart são os grupos produtivos e entidades artesanais, além dos artesãos individuais de todo o Ceará.", "Avenida Santos Dumont, 1589"));
        arrayList.add(new LocalizationItem(R.drawable.centro_de_turismo_ceara_lowres, "Centro de Turismo do Ceará - Emcetur", "Quando se fala em cultura e artesanato no Ceará, praticamente falamos do Centro de Turismo do Ceará. A EMCETUR foi inaugurada no início dos anos 70, onde desde o final dos anos 1800 funcionava o primeiro presídio do Ceará. Totalmente reformulado, você encontrará alguns galpões com o melhor do artesanato cearense e alguns outros atrativos. ", "Rua Senador Pompeu, 350"));
        arrayList.add(new LocalizationItem(R.drawable.mercado_central_fortaleza_lowres, "Mercado Central de Fortaleza", "O Mercado Central de Fortaleza é um mercado especializado em produtos artesanais cearenses localizado na cidade de Fortaleza, Ceará, Brasil. É de propriedade da prefeitura municipal.", "Av. Alberto Nepomuceno, 199"));
        arrayList.add(new LocalizationItem(R.drawable.feira_beiramar_lowres, "Feirinha da Beira Mar", "A feira tem uma localização ótima para turistas, no calçadão da praia de Meireles, e oferece grande variedade de produtos. Por lá você encontrará castanhas variadas, vestidos, bolsas, sapatos de couro, tecidos bordados, camisas etc.\n" +
                "Todos os dias, a partir das 18h, a feirinha se torna um dos points na orla de Fortaleza. ", "Av. Beira Mar, Meireles"));

        ArrayAdapter adapter = new LocalizationAdapter(this, arrayList);
        listView.setAdapter(adapter);
    }
}
