package com.example.customchatting.config;

public class CustomConfig {

    private static CustomConfig customConfig;
    private int countOfInputServerUrl;
    private String urlString;
    private String email;

    private CustomConfig() {
        urlString = "{webserver url}";
    }

    public static CustomConfig getInstance() {
        if (customConfig == null) {
            customConfig = new CustomConfig();
        }
        return customConfig;
    }

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCountOfInputServerUrl() {
        return countOfInputServerUrl;
    }

    public void setCountOfInputServerUrl(int countOfInputServerUrl) {
        this.countOfInputServerUrl = countOfInputServerUrl;
    }
}
