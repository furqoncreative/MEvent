package com.furqoncreative.mevent.model;

public class Konser extends Event {
    private String Artis;

    public Konser(String judul, String tanggal, String lokasi, String deskripsi, int poster, String artis) {
        super(judul, tanggal, lokasi, deskripsi, poster);
        Artis = artis;

    }

    public String getArtis() {
        return Artis;
    }

    public void setArtis(String artis) {
        Artis = artis;
    }

}
