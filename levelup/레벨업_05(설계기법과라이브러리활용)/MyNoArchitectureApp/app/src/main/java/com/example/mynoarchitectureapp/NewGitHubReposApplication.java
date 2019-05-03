package com.example.mynoarchitectureapp;

import android.app.Application;
import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewGitHubReposApplication extends Application {
  private Retrofit retrofit;
  private GitHubService gitHubService;

  @Override
  public void onCreate() {
    super.onCreate();
    // 어느 액티비티에서나 API를 이용할 수 있게 이 클래스에서 API를 이용한다
    setupAPIClient();
  }

  private void setupAPIClient() {
    HttpLoggingInterceptor logging = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
      @Override
      public void log(String message) {
        Log.d("API LOG", message);
      }
    });

    logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
    Log.d("API LOG", "1");
    OkHttpClient client = new OkHttpClient.Builder().addInterceptor(logging).build();
    Log.d("API LOG", "2");
    retrofit = new Retrofit.Builder()
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build();
    Log.d("API LOG", "3");
    gitHubService = retrofit.create(GitHubService.class);
    Log.d("API LOG", "4");
  }

  public GitHubService getGitHubService() {
    return gitHubService;
  }
}
