package com.example.myretrofitapp.dummy;

import android.util.Log;

import com.example.myretrofitapp.RetrofitClient;
import com.example.myretrofitapp.dummy.model.Employee;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class EmployeeService {

    private final String TAG = EmployeeService.class.getSimpleName();
    private final String BASE_URL = "http://dummy.restapiexample.com/";

    private Retrofit retrofit;
    private RetrofitEmployeeApi retrofitEmployeeApi;
    // Call : 요청
    private Call<List<Employee>> callEmployees;
    private Call<Employee> callEmployee;
    // Callback : 요청을 받은거
    private Callback<List<Employee>> retrofitEmployeesCallback;
    private Callback<Employee> retrofitEmployeeCallback;
    private Gson gson;

    public EmployeeService() {
        retrofit = RetrofitClient.getRetrofitInstance(BASE_URL);

        gson = new Gson();

        initRetrofitService();
    }

    // TODO: callback 레스토랑 리스트 / 레스토랑 1개 / 레스토랑 추가 ...
    public void initRetrofitService() {
        retrofitEmployeeApi = retrofit.create(RetrofitEmployeeApi.class);

        initCallback();
    }

    private void initCallback() {
        retrofitEmployeesCallback = new Callback<List<Employee>>() {
            @Override
            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
                List<Employee> employees = response.body();
//                EmployeesVO employeeListVO = gson.fromJson(result, Employee.class);

                for (Employee employee : employees) {
                    Log.d(TAG, employee.toString());
                }
            }

            @Override
            public void onFailure(Call<List<Employee>> call, Throwable t) {
                Log.d(TAG, "fail");
                t.printStackTrace();
            }
        };

        retrofitEmployeeCallback = new Callback<Employee>() {
            @Override
            public void onResponse(Call<Employee> call, Response<Employee> response) {
                Employee employee = response.body();
//                EmployeesVO employeeListVO = gson.fromJson(result, Employee.class);

                Log.d(TAG, response.toString());
            }

            @Override
            public void onFailure(Call<Employee> call, Throwable t) {
                Log.d(TAG, t.getMessage());
                t.printStackTrace();
            }
        };
    }

    public void executeGetEmployees() {
        callEmployees = retrofitEmployeeApi.getEmployees();
        callEmployees.enqueue(retrofitEmployeesCallback);
    }

    public void executeGetEmployee(int id) {
        callEmployee = retrofitEmployeeApi.getEmployee(id);
        callEmployee.enqueue(retrofitEmployeeCallback);
    }

    public void executePostEmployee(Employee employee) {
        Log.d(TAG, gson.toJson(employee));
        callEmployee = retrofitEmployeeApi.postEmployee(employee);
        callEmployee.enqueue(retrofitEmployeeCallback);
    }

}
