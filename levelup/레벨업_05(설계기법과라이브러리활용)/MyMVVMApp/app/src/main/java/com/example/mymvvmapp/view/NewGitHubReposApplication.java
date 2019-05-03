package com.example.mymvvmapp.view;

import android.app.Application;
import android.util.Log;

import com.example.mymvvmapp.model.GitHubService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewGitHubReposApplication extends Application {

    private static final String TAG = NewGitHubReposApplication.class.getSimpleName();

    private Retrofit retrofit;
    private GitHubService gitHubService;

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate()");
        super.onCreate();
        // 어느 Activity에서라도 API를 이용할 수 있게 이 클래스에서 API를 이용한다
        setupAPIClient();
    }

    private void setupAPIClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.d(TAG, "API Log : " + message);
            }
        });

        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        Log.d(TAG, "setLevel()");

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(logging).build();
        Log.d(TAG, "OkHttpClient.build()");

        retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        Log.d(TAG, "retrofit.build()");

        gitHubService = retrofit.create(GitHubService.class);
        Log.d(TAG, "retrofit.create()");
    }

    public GitHubService getGitHubService() {
        return gitHubService;
    }
}
