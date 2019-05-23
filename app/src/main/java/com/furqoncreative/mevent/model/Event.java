package com.furqoncreative.mevent.model;

import android.net.Uri;

/**
 * Created by Aws on 28/01/2018.
 */

public class Event {

    private String Judul;
    private String Tanggal;
    private String Lokasi ;
    private String Deskripsi ;
    private String Poster ;

    public Event() {
    }

    public Event(String judul, String tanggal, String lokasi, String deskripsi, String poster) {

        Judul = judul;
        Tanggal = tanggal;
        Lokasi = lokasi;
        Deskripsi = deskripsi;
        Poster =  poster;
    }


    public String getJudul() {
        return Judul;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public String getPoster() {
        return Poster;
    }


    public void setJudul(String judul) {
        Judul = judul;
    }

    public void setTanggal(String tanggal) {
        Tanggal = tanggal;
    }

    public void setLokasi(String lokasi) {
        Lokasi = lokasi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }
}
