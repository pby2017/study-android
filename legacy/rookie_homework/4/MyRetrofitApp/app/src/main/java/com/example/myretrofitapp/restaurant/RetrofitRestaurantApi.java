package com.example.myretrofitapp.restaurant;


import com.example.myretrofitapp.dummy.model.Employee;
import com.example.myretrofitapp.restaurant.model.Restaurant;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

interface RetrofitRestaurantApi {
    @GET("restful/restaurant/")
    Call<List<Restaurant>> getRestaurants();

    @GET("restful/restaurant/{id}/")
    Call<Restaurant> getRestaurant(
            @Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST("restful/restaurant/")
    Call<Restaurant> postRestaurant(
            @Body Restaurant restaurant);

    @Headers("Content-Type: application/json")
    @PUT("restful/restaurant/{id}/")
    Call<Restaurant> putRestaurant(
            @Path("id") int id,
            @Body Restaurant restaurant);

    @DELETE("restful/restaurant/{id}/")
    Call<Restaurant> deleteRestaurant(
            @Path("id") int id);
}
