package com.example.myretrofitapp.dummy;

import com.example.myretrofitapp.dummy.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface RetrofitEmployeeApi {
    @GET("api/v1/employees")
    Call<List<Employee>> getEmployees();

    @GET("api/v1/employee/{id}")
    Call<Employee> getEmployee(
            @Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST("api/v1/create")
    Call<Employee> postEmployee(
            @Body Employee employee);
}
