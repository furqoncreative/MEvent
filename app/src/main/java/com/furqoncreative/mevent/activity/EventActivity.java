package com.furqoncreative.mevent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.furqoncreative.mevent.R;
import com.furqoncreative.mevent.adapter.RecyclerViewAdapter;
import com.furqoncreative.mevent.model.Event;

import java.util.ArrayList;
import java.util.List;

public class EventActivity extends AppCompatActivity {
    List<Event> listEvent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        listEvent = new ArrayList<>();
        listEvent.add(new Event("Seminar","Tanggal","Lokasi","Deskirpsi",R.drawable.thevigitarian));
        listEvent.add(new Event("Konser","Tanggal","Lokasi","Deskirpsi",R.drawable.thevigitarian));
        listEvent.add(new Event("Lomba","Tanggal","Lokasi","Deskirpsi",R.drawable.thevigitarian));
        listEvent.add(new Event("Konser","Tanggal","Lokasi","Deskirpsi",R.drawable.thevigitarian));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,listEvent);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);

    }
}
