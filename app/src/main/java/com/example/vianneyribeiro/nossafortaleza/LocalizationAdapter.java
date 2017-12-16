package com.example.vianneyribeiro.nossafortaleza;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by INTRANET on 16/12/2017.
 */

public class LocalizationAdapter extends ArrayAdapter<LocalizationItem> {

    private final Context context;
    private final ArrayList<LocalizationItem> arrayList;

    public LocalizationAdapter(Context context, ArrayList<LocalizationItem> arrayList) {
        super(context, R.layout.list_item, arrayList);
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.list_item, parent, false);
        TextView nome = (TextView) row.findViewById(R.id.nome);
        TextView descricao = (TextView) row.findViewById(R.id.descricao);
        TextView distancia = (TextView) row.findViewById(R.id.distancia);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageId);

        nome.setText(arrayList.get(position).getmNome());
        descricao.setText(arrayList.get(position).getmDescricao());
        distancia.setText(arrayList.get(position).getmDistancia());
        imageView.setImageResource(arrayList.get(position).getmImagem());

        return row;
    }
}
