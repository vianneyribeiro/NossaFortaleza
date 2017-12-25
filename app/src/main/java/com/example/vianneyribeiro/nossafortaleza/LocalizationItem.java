package com.example.vianneyribeiro.nossafortaleza;

/**
 * Created by INTRANET on 15/12/2017.
 */

public class LocalizationItem {

    private int mImagem;
    private String mNome;
    private String mDescricao;
    private String mLocal;

    public LocalizationItem(int mImagem, String mNome, String mDescricao, String mLocal) {
        this.mImagem = mImagem;
        this.mNome = mNome;
        this.mDescricao = mDescricao;
        this.mLocal = mLocal;
    }

    public int getmImagem() {
        return mImagem;
    }

    public String getmNome() {
        return mNome;
    }

    public String getmDescricao() {
        return mDescricao;
    }

    public String getmDistancia() {
        return mLocal;
    }
}

