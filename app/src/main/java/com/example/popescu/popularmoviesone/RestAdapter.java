package com.example.popescu.popularmoviesone;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by POPESCU on 3/11/2018.
 */

public class RestAdapter {
    private static final String baseUrl = "https://api.themoviedb.org/3/";
    private Retrofit retrofit;
    private Endpoint endpoint;

    public RestAdapter() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        endpoint = retrofit.create(Endpoint.class);
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }
}

