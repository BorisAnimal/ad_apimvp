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

        //TODO:
        //setContentView(R.layout.activity_main);

        presenter = new CitiesPresenter(this);
        presenter.getCities();
    }


}
