package com.example.boo.apimvp.people;

import java.util.Date;

import retrofit2.Retrofit;

/**
 * Created by boo on 15.10.17.
 */

public interface PersonMVP {

    interface View {
        void setName(String name);
        void setDate(String date);
        void setDescription(String description);

        void showWarning(String message);
    }

    interface Presenter {
        void getNewPeople();
    }
}
