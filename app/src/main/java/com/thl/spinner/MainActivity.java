package com.thl.spinner;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import org.angmarch.views.NiceSpinner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class MainActivity extends FragmentActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NiceSpinner niceSpinner = (NiceSpinner) findViewById(R.id.spinner);
        List<String> dataset = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        niceSpinner.attachDataSource(dataset);

        NiceSpinner niceSpinner2 = (NiceSpinner) findViewById(R.id.spinner2);
        List<String> dataset2 = new LinkedList<>(Arrays.asList("10","11","12","13","14","15","16","17","18","19"));
        niceSpinner2.attachDataSource(dataset2);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }
}