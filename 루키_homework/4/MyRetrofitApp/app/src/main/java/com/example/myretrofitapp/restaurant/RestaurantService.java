package com.example.myretrofitapp.restaurant;

import android.util.Log;

import com.example.myretrofitapp.BuildConfig;
import com.example.myretrofitapp.RetrofitClient;
import com.example.myretrofitapp.dummy.model.Employee;
import com.example.myretrofitapp.restaurant.model.Restaurant;
import com.google.gson.Gson;

import java.util.List;
import java.util.Properties;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RestaurantService {

    private final String TAG = RestaurantService.class.getSimpleName();
    private final String BASE_URL = BuildConfig.RESTAURANT_REST_API_URL;

    Properties p = new Properties();

    private Retrofit retrofit;
    private RetrofitRestaurantApi retrofitRestaurantApi;
    // Call : 요청
    private Call<Restaurant> callRestaurant;
    private Call<List<Restaurant>> callRestaurants;
    // Callback : 요청을 받은거
    private Callback<Restaurant> retrofitRestaurantCallback;
    private Callback<List<Restaurant>> retrofitRestaurantsCallback;
    private Gson gson;

    public RestaurantService() {
        retrofit = RetrofitClient.getRetrofitInstance(BASE_URL);

        gson = new Gson();

        initRetrofitService();
    }

    // TODO: callback 레스토랑 리스트 / 레스토랑 1개 / 레스토랑 추가 ...
    public void initRetrofitService() {
        retrofitRestaurantApi = retrofit.create(RetrofitRestaurantApi.class);

        initCallback();
    }

    private void initCallback() {
        retrofitRestaurantCallback = new Callback<Restaurant>() {
            @Override
            public void onResponse(Call<Restaurant> call, Response<Restaurant> response) {
                Restaurant restaurant = response.body();
//                RestaurantsVO restaurantListVO = gson.fromJson(result, Employee.class);

                Log.d(TAG, response.message());
            }

            @Override
            public void onFailure(Call<Restaurant> call, Throwable t) {
                Log.d(TAG, "fail");
                t.printStackTrace();
            }
        };

        retrofitRestaurantsCallback = new Callback<List<Restaurant>>() {
            @Override
            public void onResponse(Call<List<Restaurant>> call, Response<List<Restaurant>> response) {
                List<Restaurant> restaurants = response.body();
//                RestaurantsVO restaurantListVO = gson.fromJson(result, Employee.class);

                for (Restaurant restaurant : restaurants) {
                    Log.d(TAG, restaurant.toString());
                }
            }

            @Override
            public void onFailure(Call<List<Restaurant>> call, Throwable t) {
                Log.d(TAG, "fail");
                t.printStackTrace();
            }
        };
    }

    public void executeGetRestaurant(int id) {
        callRestaurant = retrofitRestaurantApi.getRestaurant(id);
        callRestaurant.enqueue(retrofitRestaurantCallback);
    }

    public void executeGetRestaurants() {
        callRestaurants = retrofitRestaurantApi.getRestaurants();
        callRestaurants.enqueue(retrofitRestaurantsCallback);
    }

    public void executePostRestaurant(Restaurant restaurant) {
        Log.d(TAG, gson.toJson(restaurant));
        callRestaurant = retrofitRestaurantApi.postRestaurant(restaurant);
        callRestaurant.enqueue(retrofitRestaurantCallback);
    }

    public void executePutRestaurant(int id, Restaurant restaurant){
        callRestaurant = retrofitRestaurantApi.putRestaurant(id, restaurant);
        callRestaurant.enqueue(retrofitRestaurantCallback);
    }

    public void executeDeleteRestaurant(int id){
        callRestaurant = retrofitRestaurantApi.deleteRestaurant(id);
        callRestaurant.enqueue(retrofitRestaurantCallback);
    }

}
