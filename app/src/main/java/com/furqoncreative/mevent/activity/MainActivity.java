package com.furqoncreative.mevent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.furqoncreative.mevent.adapter.ImageSliderAdapter;
import com.furqoncreative.mevent.model.Event;
import com.furqoncreative.mevent.R;
import com.furqoncreative.mevent.adapter.RecyclerViewAdapter;
import com.furqoncreative.mevent.model.ImageSliderModel;
import com.furqoncreative.mevent.model.Konser;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {


    List<ImageSliderModel> imageList = new ArrayList<>();

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.btn_events)
    CardView btnEvents;
    @BindView(R.id.btn_konser)
    CardView btnKonser;
    @BindView(R.id.btn_seminar)
    CardView btnSeminar;
    @BindView(R.id.btn_lomba)
    CardView btnLomba;
    @BindView(R.id.indicator)
    CirclePageIndicator indicator;

    View view;
    int currentPage = 0;
    int NUM_PAGES = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initSlider(view);

    }

    private List<ImageSliderModel> getImageList() {
        final List<ImageSliderModel> imageList = new ArrayList<>();

        return imageList;
    }

    private void initImageSlider(View view) {
        //Set the pager with an adapter
        if (viewPager != null) {
            viewPager.setAdapter(new ImageSliderAdapter(this, imageList, Contans.BANNER_URL));
        }

        CirclePageIndicator indicator = findViewById(R.id.indicator);

        indicator.setViewPager(viewPager);

        final float density = getResources().getDisplayMetrics().density;

        //Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES = getImageList().size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                if (viewPager != null) {
                    viewPager.setCurrentItem(currentPage++, true);
                }
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });
    }
    public void initSlider(final View view) {
        imageList.clear();
        imageList.add(new ImageSliderModel("slider 1", "http://www.cae.net/wp-content/uploads/2018/03/elearning-cae-dexway.jpg"));
        imageList.add(new ImageSliderModel("slider 2", "https://tokbox.com/blog/wp-content/uploads/2015/09/EDULinkedIn2.png"));
        imageList.add(new ImageSliderModel("slider 3", "https://3playmedia-wpengine.netdna-ssl.com/wp-content/uploads/elearning-hero-1400x600-1-1400x600.jpg"));

        initImageSlider(view);
    }

    @OnClick({R.id.btn_lomba, R.id.btn_seminar, R.id.btn_konser, R.id.btn_events})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_events:
                startActivity(new Intent(this, EventActivity.class));
                break;
            case R.id.btn_seminar:
                startActivity(new Intent(this, SeminarActivity.class));
                break;
            case R.id.btn_konser:
                startActivity(new Intent(this, KonserActivity.class));
                break;
            case R.id.btn_lomba:
                startActivity(new Intent(this, LombaActivity.class));
                break;
        }
    }
}

