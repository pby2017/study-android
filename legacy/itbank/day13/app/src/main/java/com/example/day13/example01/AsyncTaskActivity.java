package com.example.day13.example01;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.day13.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class AsyncTaskActivity extends AppCompatActivity implements DialogInterface.OnClickListener, View.OnClickListener {

    final private static String CUSTOM_ASYNC = "custom_async_task";
    final private static String SAVE_FAIL = "실패";

    private Button sendToServerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);

        initView();

        try {
            Log.d(CUSTOM_ASYNC, new CustomAsyncTask().execute("abc", "def", "ghi").get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_send_to_server:
                AlertDialog alertDialog = createCustomDialog();
                alertDialog.show();
                break;
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case DialogInterface.BUTTON_POSITIVE:
                Toast.makeText(getApplicationContext(), R.string.send_complete, Toast.LENGTH_SHORT).show();
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                finish();
                break;
        }
    }

    private void initView() {
        sendToServerButton = findViewById(R.id.button_send_to_server);
        sendToServerButton.setOnClickListener(this);
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
                        try {
                            Log.d(CUSTOM_ASYNC, new CustomHttpAsyncTask().execute(urlString).get());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        }
                    }
                })
                .setNegativeButton(R.string.cancel, this)
                .create();
    }

    public static class CustomAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {
            StringBuilder stringBuilder = new StringBuilder();

            for (String string : strings) {
                stringBuilder.append(String.format("%s\n", string));
            }

            return stringBuilder.toString();
        }
    }

    public static class CustomHttpAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {
            try {
                if (strings.length != 1) {
                    return SAVE_FAIL;
                }
                String urlString = strings[0];
                URL url = new URL(urlString);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

                conn.setDoOutput(true);
                conn.setDoInput(true);

                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(conn.getOutputStream());

                outputStreamWriter.write("id=pby");
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
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return "good";
        }
    }
}
