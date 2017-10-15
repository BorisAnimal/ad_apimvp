package com.example.boo.apimvp.people;

import com.example.boo.apimvp.api.person.PersonAPI;
import com.example.boo.apimvp.api.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by boo on 15.10.17.
 */

public class PersonPresenter implements PersonMVP.Presenter {
    private PersonAPI client;
    private PersonView view;

    public PersonPresenter(PersonView view) {
        this.view = view;
        client = RetrofitService.getClient().create(PersonAPI.class);
    }

    @Override
    public void getNewPeople() {
        Call<PersonModel> call = client.getPerson();
        call.enqueue(new Callback<PersonModel>() {
            @Override
            public void onResponse(Call<PersonModel> call, Response<PersonModel> response) {
                if(response.body() != null) {
                    PersonModel people = response.body();
                    view.setDate(people.getBirthday());
                    view.setDescription(people.getDescription());
                    view.setName(people.getName());
                }
                else
                    view.showWarning("Error in request. Try again");
            }

            @Override
            public void onFailure(Call<PersonModel> call, Throwable t) {
                view.showWarning(t.getMessage());
            }
        });
    }
}
