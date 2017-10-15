package com.example.boo.apimvp.city;

import java.util.List;

/**
 * Created by boo on 16.10.17.
 */

public interface CitiesMVP {
    interface View {
        void addCities(List<String> cities);

        void showWarning(String s);
    }

    interface Presenter {

        void getCities();
    }

 }