package com.example.boo.apimvp.people;

import com.google.gson.annotations.SerializedName;

/**
 * Created by boo on 15.10.17.
 */

public class PeopleModel {
    @SerializedName("name")
    private String name;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("description")
    private String  description;

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getDescription() {
        return description;
    }

    public PeopleModel(String name, String birthday, String description) {

        this.name = name;
        this.birthday = birthday;
        this.description = description;
    }
}
