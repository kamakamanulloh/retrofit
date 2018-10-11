package com.kamak.retrofit.services;


import com.kamak.retrofit.models.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("books")
    Call<List<Model>> getBook();

}
