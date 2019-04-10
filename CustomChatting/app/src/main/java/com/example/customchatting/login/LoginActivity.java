package com.example.customchatting.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.customchatting.R;

import java.util.concurrent.ExecutionException;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    final private static String CUSTOM_ASYNC = "custom_async_task";
    final private static String SAVE_FAIL = "실패";
    private String url;

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

        initView();

        createCustomDialog().show();

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

    private void login() {
        String email = loginEmailEditText.getText().toString();
        String password = loginPasswordEditText.getText().toString();
        try {
            Log.d(CUSTOM_ASYNC, String.format("%s / %s / %s", url, email, password));
            Log.d(CUSTOM_ASYNC, new CustomHttpAsyncTask().execute(url, email, password).get());
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
            Log.d(CUSTOM_ASYNC, new CustomHttpAsyncTask().execute(
                    url, email, name, password).get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private AlertDialog createCustomDialog() {
        final EditText UrlEditText = new EditText(this);

        return new AlertDialog.Builder(this)
                .setTitle("Server 접속 주소를 입력하세요.")
                .setMessage("ex) http://192.168.0.1:8080/directory/file")
                .setView(UrlEditText)
                .setPositiveButton(R.string.save, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String urlString = UrlEditText.getText().toString();
                        url = urlString;
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .create();
    }

    public static class CustomHttpAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {
            try {
                if (strings.length != 3 && strings.length != 4) {
                    return SAVE_FAIL;
                }
                if (strings.length == 3) {
                    String urlString = strings[0];
                    String email = strings[1];
                    String password = strings[2];

                    URL url = new URL(urlString);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

                    conn.setDoOutput(true);
                    conn.setDoInput(true);

                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(conn.getOutputStream());

                    outputStreamWriter.write("email=" + email + "&password=" + password);
                    outputStreamWriter.flush();

                    if (conn.getResponseCode() == conn.HTTP_OK) {
                        InputStreamReader inputStreamReader = new InputStreamReader(conn.getInputStream(), "UTF-8");
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        StringBuffer stringBuffer = new StringBuffer();
                        String line = "";
                        while ((line = bufferedReader.readLine()) != null) {
                            stringBuffer.append(line);
                        }
                        Log.d(CUSTOM_ASYNC, String.format("stringBuffer : %s", stringBuffer));
                    } else {
                        Log.d(CUSTOM_ASYNC, String.valueOf(conn.getResponseCode()));
                    }
                    outputStreamWriter.close();
                } else {

                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return "good";
        }
    }
}