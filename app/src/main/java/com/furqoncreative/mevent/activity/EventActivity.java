package com.furqoncreative.mevent.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.net.Uri;
import android.os.Bundle;

import com.furqoncreative.mevent.R;
import com.furqoncreative.mevent.adapter.RecyclerViewAdapter;
import com.furqoncreative.mevent.model.Event;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class EventActivity extends BaseActivity {
    List<Event> listEvent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (actionBar != null) {
            actionBar.setTitle("Events");
        }


        getDatabaseRef().child("events").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listEvent = new ArrayList<>();

                RecyclerView myrv = findViewById(R.id.recyclerview_id);
                RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(EventActivity.this, listEvent);
                myrv.setLayoutManager(new GridLayoutManager(EventActivity.this, 2));
                myrv.setAdapter(myAdapter);

                for (DataSnapshot item : dataSnapshot.getChildren()) {
                    String judul = item.child("judul").getValue(String.class);
                    String tanggal = item.child("tanggal").getValue(String.class);
                    String lokasi = item.child("lokasi").getValue(String.class);
                    String desc = item.child("desc").getValue(String.class);
                    String url = item.child("url").getValue(String.class);

                    listEvent.add(new Event(judul,tanggal,lokasi, desc, url ));
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
