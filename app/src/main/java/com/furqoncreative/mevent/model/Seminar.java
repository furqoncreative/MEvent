package com.furqoncreative.mevent.model;

import android.net.Uri;

public class Seminar extends Event {
    private String Speaker;

    public Seminar(String judul, String tanggal, String lokasi, String deskripsi, String speaker, String poster ) {
        super(judul, tanggal, lokasi, deskripsi, poster);
        Speaker = speaker;
    }

    public String getSpeaker() {
        return Speaker;
    }

    public void setSpeaker(String speaker) {
        Speaker = speaker;
    }
}
