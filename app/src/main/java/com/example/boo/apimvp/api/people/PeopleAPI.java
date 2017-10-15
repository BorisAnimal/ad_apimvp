package com.example.boo.apimvp.api.people;

import retrofit2.Call;
import retrofit2.http.GET;

import com.example.boo.apimvp.people.PeopleModel;

/**
 * Created by boo on 15.10.17.
 */

public interface PeopleAPI {
    @GET("people.php")
    Call<PeopleModel> getPerson();
}
