package com.furqoncreative.mevent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.furqoncreative.mevent.R;
import com.furqoncreative.mevent.adapter.RecyclerViewAdapter;
import com.furqoncreative.mevent.adapter.SeminarAdapter;
import com.furqoncreative.mevent.model.Event;
import com.furqoncreative.mevent.model.Seminar;

import java.util.ArrayList;
import java.util.List;

public class SeminarActivity extends AppCompatActivity {
    List<Seminar> listEvent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seminar);


        listEvent = new ArrayList<>();
        listEvent.add(new Seminar("Seminar Nasional","20 Mei 2019","Bandung","Deskirpsi", "Bapak Jokowi","https://eventkampus.com/data/event/0/595/poster-seminar-nasional-kewirausahaan.jpg"));
        listEvent.add(new Seminar("Seminar Nasional","20 Mei 2019","Bandung","Deskirpsi", "Bapak Jokowi","https://www.fotojet.com/template-imgs/classic/poster/balanced-friendship-poster.jpg"));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        SeminarAdapter myAdapter = new SeminarAdapter(this,listEvent);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}
