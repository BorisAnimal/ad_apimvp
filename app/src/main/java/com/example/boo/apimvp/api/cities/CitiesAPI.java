package com.example.boo.apimvp.api.cities;

import com.example.boo.apimvp.city.CitiesModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by boo on 16.10.17.
 */

public interface CitiesAPI {
    @GET("cities.php")
    Call<CitiesModel> getCities(@Query("page") int page);


}
