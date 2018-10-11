package com.kamak.retrofit.generator;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Generator {
    public static String BASE_URL="https://anapioficeandfire.com/api/";
    private static Retrofit.Builder builder=
            new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit=builder.build();
    private static HttpLoggingInterceptor loggingInterceptor=
            new HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY);
    private static OkHttpClient.Builder httpclient=
            new OkHttpClient.Builder();
    public static void chaneApiBaseUrl(String newApiBaseUrl){
        BASE_URL=newApiBaseUrl;
        builder =new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL);
    }
    public static <S>S createService(Class<S>serviceClass){
        if(!httpclient.interceptors().contains(loggingInterceptor)){
            httpclient.addInterceptor(loggingInterceptor);
            builder.client(httpclient.build());
            retrofit=builder.build();
        }

        return retrofit.create(serviceClass);
    }
}
