package com.example.boo.apimvp.api.person;

import retrofit2.Call;
import retrofit2.http.GET;

import com.example.boo.apimvp.people.PersonModel;

/**
 * Created by boo on 15.10.17.
 */

public interface PersonAPI {
    @GET("people.php")
    Call<PersonModel> getPerson();
}
