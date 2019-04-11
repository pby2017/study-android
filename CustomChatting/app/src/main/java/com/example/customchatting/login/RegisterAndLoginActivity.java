package com.example.customchatting.login;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.customchatting.R;
import com.example.customchatting.chatting.ChattingActivity;
import com.example.customchatting.config.CustomConfig;
import com.example.customchatting.constant.CustomConstant;
import com.google.firebase.iid.FirebaseInstanceId;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

import static com.example.customchatting.constant.CustomConstant.LogConstant.CUS_ASYNC_TASK;
import static com.example.customchatting.constant.CustomConstant.LogConstant.CUS_LOGIN_ACTIVITY;

public class RegisterAndLoginActivity extends AppCompatActivity implements View.OnClickListener {

    final private static String SAVE_FAIL = "실패";

    private Button loginButton;
    private Button registerUserButton;
    private EditText loginEmailEditText;
    private EditText loginPasswordEditText;
    private EditText registerUserEmailEditText;
    private EditText registerUserNameEditText;
    private EditText registerUserPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_and_login);

        Log.d(CUS_LOGIN_ACTIVITY, "onCreate()");

        initView();

        initialize();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_login:
                login();
                break;
            case R.id.button_register_user:
                registerUser();
                break;
        }
    }

    private void initView() {
        loginButton = findViewById(R.id.button_login);
        loginButton.setOnClickListener(this);
        registerUserButton = findViewById(R.id.button_register_user);
        registerUserButton.setOnClickListener(this);

        loginEmailEditText = findViewById(R.id.edit_text_login_email);
        loginPasswordEditText = findViewById(R.id.edit_text_login_password);
        registerUserEmailEditText = findViewById(R.id.edit_text_register_user_email);
        registerUserNameEditText = findViewById(R.id.edit_text_register_user_name);
        registerUserPasswordEditText = findViewById(R.id.edit_text_register_user_password);
    }

    private void initialize() {

        if (CustomConfig.getInstance().getEmail() != null) {
            // TODO: FragNav로 메인 구성 (친구목록, 채팅목록, 기타, 기타)

            Intent chattingIntent = new Intent(this, ChattingActivity.class);
            chattingIntent.putExtra("receiverEmail", "b@b.b");
            startActivity(chattingIntent);
        }
    }

    private void login() {
        String email = loginEmailEditText.getText().toString();
        String password = loginPasswordEditText.getText().toString();
        try {
            String loginRequestResult = new CustomHttpAsyncTask().execute(
                    CustomConstant.CommunicatingType.TYPE_SIGNIN,
                    CustomConfig.getInstance().getUrlString(),
                    email,
                    password)
                    .get();
            if(loginRequestResult.equals(CustomConstant.CommunicatingCodeResult.CODE_SUCCESS)){
                CustomConfig.getInstance().setEmail(email);
                Intent chattingIntent = new Intent(this, ChattingActivity.class);
                chattingIntent.putExtra("receiverEmail", "b@b.b");
                startActivity(chattingIntent);
            }
            Log.d(CUS_ASYNC_TASK, loginRequestResult);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void registerUser() {
        String email = registerUserEmailEditText.getText().toString();
        String name = registerUserNameEditText.getText().toString();
        String password = registerUserPasswordEditText.getText().toString();
        try {
            String registerUserRequestResult = new CustomHttpAsyncTask().execute(
                    CustomConstant.CommunicatingType.TYPE_SIGNUP,
                    CustomConfig.getInstance().getUrlString(),
                    email,
                    name,
                    password)
                    .get();
            if(registerUserRequestResult.equals(CustomConstant.CommunicatingCodeResult.CODE_SUCCESS)){
                CustomConfig.getInstance().setEmail(email);
                Intent chattingIntent = new Intent(this, ChattingActivity.class);
                chattingIntent.putExtra("receiverEmail", "b@b.b");
                startActivity(chattingIntent);
            }
            Log.d(CUS_ASYNC_TASK, registerUserRequestResult);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }



    public static class CustomHttpAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {

            if (strings.length != 4 && strings.length != 5) {
                    return SAVE_FAIL;
            }
            String type = strings[0];
            StringBuffer stringBuffer = new StringBuffer();
            if (type.equals(CustomConstant.CommunicatingType.TYPE_SIGNIN)) {
                if (strings.length == 4) {
                    try {
                        String urlString = strings[1];
                        String email = strings[2];
                        String password = strings[3];

                        URL url = new URL(urlString);
                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("POST");
                        conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

                        conn.setDoOutput(true);
                        conn.setDoInput(true);

                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(conn.getOutputStream());

                        outputStreamWriter.write(String.format("type=%s&email=%s&password=%s", type, email, password));
                        outputStreamWriter.flush();

                        if (conn.getResponseCode() == conn.HTTP_OK) {
                            InputStreamReader inputStreamReader = new InputStreamReader(conn.getInputStream(), "UTF-8");
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            String line = "";
                            while ((line = bufferedReader.readLine()) != null) {
                                stringBuffer.append(line);
                            }
                            Log.d(CUS_ASYNC_TASK, String.format("signin stringBuffer : %s", stringBuffer.toString()));

                        } else {
                            Log.d(CUS_ASYNC_TASK, String.valueOf(conn.getResponseCode()));
                        }

                        outputStreamWriter.close();
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            } else if (type.equals(CustomConstant.CommunicatingType.TYPE_SIGNUP)) {

                if (strings.length == 5) {
                    try {
                        String urlString = strings[1];
                        String email = strings[2];
                        String name = strings[3];
                        String password = strings[4];
                        String token = FirebaseInstanceId.getInstance().getToken();

                        URL url = new URL(urlString);
                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("POST");
                        conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

                        conn.setDoOutput(true);
                        conn.setDoInput(true);

                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(conn.getOutputStream());

                        outputStreamWriter.write(String.format("type=%s&email=%s&name=%s&password=%s&token=%s", type, email, name, password, token));
                        outputStreamWriter.flush();

                        if (conn.getResponseCode() == conn.HTTP_OK) {
                            InputStreamReader inputStreamReader = new InputStreamReader(conn.getInputStream(), "UTF-8");
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            String line = "";
                            while ((line = bufferedReader.readLine()) != null) {
                                stringBuffer.append(line);
                            }
                            Log.d(CUS_ASYNC_TASK, String.format("signup stringBuffer : %s", stringBuffer.toString()));

                            if (stringBuffer.toString().equals(CustomConstant.CommunicatingCodeResult.CODE_SUCCESS)) {
                                CustomConfig.getInstance().setEmail(email);
                            }
                        } else {
                            Log.d(CUS_ASYNC_TASK, String.valueOf(conn.getResponseCode()));
                        }
                        outputStreamWriter.close();
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return stringBuffer.toString();
        }
    }
}