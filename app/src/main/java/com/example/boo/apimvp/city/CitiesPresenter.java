package com.example.boo.apimvp.city;

import com.example.boo.apimvp.api.RetrofitService;
import com.example.boo.apimvp.api.cities.CitiesAPI;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by boo on 16.10.17.
 */

public class CitiesPresenter implements CitiesMVP.Presenter {
    private CitiesAPI client;
    private CitiesView view;
    private int pagesNum = 0;

    public CitiesPresenter(CitiesView view) {
        this.view = view;

        client = RetrofitService.getClient().create(CitiesAPI.class);
    }

    @Override
    public void getCities() {

        Call<CitiesModel> call = client.getCities(new Random().nextInt(pagesNum+1));
        call.enqueue(new Callback<CitiesModel>() {
            @Override
            public void onResponse(Call<CitiesModel> call, Response<CitiesModel> response) {
                if( response.body() != null && response.body().getError() == 0) {
                    CitiesModel model = response.body();
                    view.addCities(model.getCities());
                    pagesNum = model.getPages();
                }
                else
                    view.showWarning("Error in request. Try again");
            }

            @Override
            public void onFailure(Call<CitiesModel> call, Throwable t) {
                view.showWarning(t.getMessage());
            }
        });
    }
}
