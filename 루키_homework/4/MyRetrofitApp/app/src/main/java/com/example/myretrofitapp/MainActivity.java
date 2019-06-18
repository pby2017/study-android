package com.example.myretrofitapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myretrofitapp.dummy.EmployeeService;
import com.example.myretrofitapp.dummy.model.Employee;
import com.example.myretrofitapp.restaurant.RestaurantService;
import com.example.myretrofitapp.restaurant.model.Restaurant;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testRestaurantService();
    }

    private void testRestaurantService() {
        RestaurantService restaurantService = new RestaurantService();

        Restaurant restaurant = new Restaurant("BBQ 독도점", "경상북도 울릉군 울릉읍 독도리", false);
//        Restaurant restaurant = new Restaurant(14, "BBQ 제주 3호점", "제주특별자치도", true);

        // POST = value가 달라도 무조건 추가
//        restaurantService.executePostRestaurant(restaurant);
//        restaurantService.executePutRestaurant(20, restaurant);
//        restaurantService.executeDeleteRestaurant(19);
        restaurantService.executeGetRestaurants();
    }

    private void testEmployeeService() {
        EmployeeService employeeService = new EmployeeService();

        Employee employee = new Employee("Heeeeeeeeey" + new Date().getSeconds(), "12", "12");
        employeeService.executePostEmployee(employee);
        employeeService.executeGetEmployees();
    }
}