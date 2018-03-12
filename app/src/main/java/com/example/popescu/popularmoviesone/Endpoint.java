package com.example.popescu.popularmoviesone;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by POPESCU on 3/12/2018.
 */

public interface Endpoint {
    @GET("movie/now_playing")
    Call<Movies>callNowPlaying(@Query("api_key")String apiKey, @Query("language")String language, @Query("page")String page);
    @GET("movie/popular")
    Call<Movies> callPopular(@Query("api_key")String apiKey, @Query("language")String language, @Query("page")String page);
    @GET("movie/upcoming")
    Call<Movies>callUpcoming(@Query("api_key")String apiKey,@Query("language")String language,@Query("page")String page);
}