package com.example.myretrofitapp.dummy.model;

import com.google.gson.annotations.SerializedName;

public class Employee {
    private String id;
    @SerializedName("employee_name")
    private String employeeName;
    @SerializedName("employee_salary")
    private String employeeSalary;
    @SerializedName("employee_age")
    private String employeeAge;
    @SerializedName("profile_image")
    private String profileImage;

    private String name;
    private String salary;
    private String age;

    public Employee(String employeeName, String employeeSalary, String employeeAge) {
        this.name = employeeName;
        this.salary = employeeSalary;
        this.age = employeeAge;
    }

    public Employee(String id, String employeeName, String employeeSalary, String employeeAge, String profileImage) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
        this.profileImage = profileImage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @Override
    public String toString() {
        return String.format("id: %s, employee_name: %s, employee_salary: %s, employee_age: %s, profile_image: %s".toLowerCase(),
                id, employeeName, employeeSalary, employeeAge, profileImage);
    }
}