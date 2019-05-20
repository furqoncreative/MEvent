package com.furqoncreative.mevent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.furqoncreative.mevent.R;
import com.furqoncreative.mevent.adapter.LombaAdapter;
import com.furqoncreative.mevent.adapter.RecyclerViewAdapter;
import com.furqoncreative.mevent.model.Event;
import com.furqoncreative.mevent.model.Lomba;

import java.util.ArrayList;
import java.util.List;

public class LombaActivity extends AppCompatActivity {
    List<Lomba> listEvent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lomba);

        listEvent = new ArrayList<>();
        listEvent.add(new Lomba("Hackaton 2019","25 Mei 2019","Bandung","Deskirpsi",R.drawable.thevigitarian,"Rp. 100.000.000"));
        listEvent.add(new Lomba("Hackaton 2019","25 Mei 2019","Bandung","Deskirpsi",R.drawable.thevigitarian,"Rp. 100.000.000"));
        listEvent.add(new Lomba("Hackaton 2019","25 Mei 2019","Bandung","Deskirpsi",R.drawable.thevigitarian,"Rp. 100.000.000"));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        LombaAdapter myAdapter = new LombaAdapter(this,listEvent);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}
