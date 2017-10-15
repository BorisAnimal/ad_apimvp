package com.example.boo.apimvp.people;

import com.example.boo.apimvp.api.people.PeopleAPI;
import com.example.boo.apimvp.api.people.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by boo on 15.10.17.
 */

public class PeoplePresenter implements PeopleMVP.Presenter {
    private PeopleAPI client;
    private PeopleView view;

    public PeoplePresenter(PeopleView view) {
        this.view = view;
        client = RetrofitService.getClient().create(PeopleAPI.class);
    }

    @Override
    public void getNewPeople() {
        Call<PeopleModel> call = client.getPerson();
        call.enqueue(new Callback<PeopleModel>() {
            @Override
            public void onResponse(Call<PeopleModel> call, Response<PeopleModel> response) {
                if(response.body() != null) {
                    PeopleModel people = response.body();
                    view.setDate(people.getBirthday());
                    view.setDescription(people.getDescription());
                    view.setName(people.getName());
                }
            }

            @Override
            public void onFailure(Call<PeopleModel> call, Throwable t) {
                view.showWarning(t.getMessage());
            }
        });
    }
}
