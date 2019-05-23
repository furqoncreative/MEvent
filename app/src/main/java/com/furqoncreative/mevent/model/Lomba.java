package com.furqoncreative.mevent.model;

import android.net.Uri;

public class Lomba extends Event {

    private String Hadiah;

    public Lomba(String judul, String tanggal, String lokasi, String deskripsi, String poster, String hadiah) {
        super(judul, tanggal, lokasi, deskripsi, poster);
        Hadiah = hadiah;
    }

    public String getHadiah() {
        return Hadiah;
    }

    public void setHadiah(String hadiah) {
        hadiah = hadiah;
    }
}
