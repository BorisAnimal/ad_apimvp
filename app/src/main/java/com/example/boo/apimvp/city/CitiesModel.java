package com.example.boo.apimvp.city;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by boo on 16.10.17.
 */

public class CitiesModel {
    @SerializedName("error")
    @Expose
    private int error;

    @SerializedName("pages")
    @Expose
    private int pages;

    @SerializedName("page")
    @Expose
    private int page;

    @SerializedName("cities")
    @Expose
    private List<String> cities;

    public CitiesModel(int error, int pages, int page, List<String> cities) {
        this.error = error;
        this.pages = pages;
        this.page = page;
        this.cities = cities;
    }

    public int getError() {

        return error;
    }

    public int getPages() {
        return pages;
    }

    public int getPage() {
        return page;
    }

    public List<String> getCities() {
        return cities;
    }
}
