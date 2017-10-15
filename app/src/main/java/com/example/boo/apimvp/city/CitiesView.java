package com.example.boo.apimvp.city;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.boo.apimvp.R;

import java.util.List;

/**
 * Created by boo on 16.10.17.
 */

public class CitiesView extends AppCompatActivity implements CitiesMVP.View {
    private CitiesMVP.Presenter presenter;
    private final String DEBUG_TAG = "[CITIES]";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        presenter = new CitiesPresenter(this);
        presenter.getCities();
    }

    @Override
    public void addCities(List<String> cities) {
        StringBuilder sb = new StringBuilder();
        for(String stirng:cities)
            sb.append(stirng);
        Log.d(DEBUG_TAG, sb.toString());
    }

    @Override
    public void showWarning(String s) {
        Log.d(DEBUG_TAG, s);
    }
}
