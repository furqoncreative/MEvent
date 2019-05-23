package com.furqoncreative.mevent.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.furqoncreative.mevent.R;
import com.squareup.picasso.Picasso;

public class EventDetailActivity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvPengisi,tvHadiah,tvTangggal, tvLokasi;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_event);

        tvtitle = (TextView) findViewById(R.id.txt_judul);
        tvTangggal = (TextView) findViewById(R.id.txt_tanggal);
        tvLokasi = (TextView) findViewById(R.id.txt_lokasi);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        tvPengisi = (TextView) findViewById(R.id.txt_pengisi);
        tvHadiah = (TextView) findViewById(R.id.txt_pengisi);
        img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Judul = intent.getExtras().getString("Judul");
        String Lokasi = intent.getExtras().getString("Lokasi");
        String Tanggal = intent.getExtras().getString("Tanggal");
        String Deskripsi = intent.getExtras().getString("Deskripsi");
        String image = intent.getExtras().getString("Poster") ;

        // Setting values

        tvtitle.setText(Judul);
        tvLokasi.setText(Lokasi);
        tvTangggal.setText(Tanggal);
        tvdescription.setText(Deskripsi);
        Picasso.get().load(image).into(img);


    }
}
