package com.furqoncreative.mevent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.furqoncreative.mevent.R;
import com.furqoncreative.mevent.adapter.KonserAdapter;
import com.furqoncreative.mevent.adapter.RecyclerViewAdapter;
import com.furqoncreative.mevent.model.Event;
import com.furqoncreative.mevent.model.Konser;

import java.util.ArrayList;
import java.util.List;

public class KonserActivity extends AppCompatActivity {
    List<Konser> listEvent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konser);

        listEvent = new ArrayList<>();
        listEvent.add(new Konser("Konser Akbar","22 Juni 2019","Jakarta","Deskirpsi","http://www.infobdg.com/v2/wp-content/uploads/2019/05/WhatsApp-Image-2019-05-10-at-13.32.541.jpeg","Armada"));
        listEvent.add(new Konser("Konser Akbar","22 Juni 2019","Jakarta","Deskirpsi","http://www.infobdg.com/v2/wp-content/uploads/2019/05/WhatsApp-Image-2019-05-10-at-13.32.542.jpeg","Noah"));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        KonserAdapter myAdapter = new KonserAdapter(this,listEvent);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}
