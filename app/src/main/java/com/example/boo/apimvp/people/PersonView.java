package com.example.boo.apimvp.people;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.boo.apimvp.R;



/**
 * Created by boo on 15.10.17.
 */

public class PersonView extends AppCompatActivity implements PersonMVP.View {
    private final String  DEBUG_TAG = "[PEOPLE]";
    private PersonMVP.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //TODO: wrong! Create your own layout
        setContentView(R.layout.activity_main);

        presenter = new PersonPresenter(this);
        presenter.getNewPeople();


        //TODO:
    }

    @Override
    public void setName(String name) {
        Log.d(DEBUG_TAG, name);
        //TODO:
    }

    @Override
    public void setDate(String date) {
        Log.d(DEBUG_TAG, date);
        //TODO:
    }

    @Override
    public void setDescription(String description) {
        Log.d(DEBUG_TAG, description);
        //TODO:
    }

    @Override
    public void showWarning(String message) {
        //TODO:
    }


}