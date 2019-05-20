package com.furqoncreative.mevent.model;

public class Seminar extends Event {
    private String Speaker;

    public Seminar(String judul, String tanggal, String lokasi, String deskripsi, String speaker,int poster ) {
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
