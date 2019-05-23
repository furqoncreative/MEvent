package com.furqoncreative.mevent.activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Locale;

public class BaseActivity extends AppCompatActivity  {

    private static final int REQUEST_CODE_PERMISSION = 2;

    public DatabaseReference db_ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    protected void onResume() {
        super.onResume();

        // make the device update its location

        // ...
    }

    @Override
    protected void onPause() {
        super.onPause();
        // stop location updates (saves battery)
    }

    public DatabaseReference getDatabaseRef() {
        return FirebaseDatabase.getInstance().getReference();
    }


    public void showMsg(String title, String message) {
        AlertDialog diabox = showMessage(title, message);
        diabox.show();
    }



    private ProgressDialog buildProgress(Context c) {
        ProgressDialog spDialog = new ProgressDialog(c);
        spDialog.setMessage("Please wait...");
        spDialog.setCancelable(false);
        return spDialog;
    }



    @Override
    public void onStop() {
        super.onStop();

    }

    public String convertTime(long time) {
        Date date = new Date(time);
        @SuppressLint("SimpleDateFormat")
        Format format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return format.format(date);
    }

    //Private area



    private AlertDialog showMessage(String title, String message) {
        return new AlertDialog.Builder(this)
                //set message, title, and icon
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .create();
    }


    public String parseDateToString(String pattern, Date src) {
        DateFormat df = new SimpleDateFormat(pattern, Locale.US);
        return df.format(src);
    }

    public Date parseDate(String pattern, String src) {
        DateFormat dateFormat = new SimpleDateFormat(pattern, Locale.US);
        Date inputDate;
        try {
            inputDate = dateFormat.parse(src);
            return inputDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
