package com.example.day18.example01;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.day18.R;
import com.example.day18.example01.adapter.MessageAdapter;
import com.example.day18.example01.model.ChattingMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import static com.example.day18.constant.CustomConstant.LogConstant.CUS_MAIN_ACTIVITY;

public class MessageActivity extends AppCompatActivity implements View.OnClickListener {

    private String myEmail = "a@a.a";
    private String url;

    private ArrayList<ChattingMessage> chattingMessages;

    private LinearLayoutManager messageLinearLayoutManager;
    private MessageAdapter messageAdapter;

    private RecyclerView showMessageRecycler;
    private EditText sendMessageEdit;
    private Button sendMessageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        initView();

        initialize();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_send_message:
                String message = sendMessageEdit.getText().toString();
                pushMessage(message);
                break;
        }
    }


    private void initView() {
        showMessageRecycler = findViewById(R.id.recycler_show_message);
        sendMessageEdit = findViewById(R.id.edit_send_message);
        sendMessageButton = findViewById(R.id.button_send_message);
        sendMessageButton.setOnClickListener(this);

    }
    private void initialize() {
        url = "http://192.168.0.191:8080/day18/send.jsp";

        startService(new Intent(this, MyFCMService.class));

        chattingMessages = new ArrayList<>();

        messageLinearLayoutManager = new LinearLayoutManager(this);
        messageAdapter = new MessageAdapter(chattingMessages, myEmail);

        showMessageRecycler.setLayoutManager(messageLinearLayoutManager);
        showMessageRecycler.setAdapter(messageAdapter);
    }

    private void pushMessage(String message) {
        try {
            new CustomHttpAsyncTask().execute(url, myEmail, message).get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
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

    public class CustomHttpAsyncTask extends android.os.AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... strings) {
            try {
                if (strings.length != 3) {
                    return "실패";
                }
                String urlString = strings[0];
                String sender = strings[1];
                String content = strings[2];

                URL url = new URL(urlString);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

                conn.setDoOutput(true);
                conn.setDoInput(true);

                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(conn.getOutputStream());

                outputStreamWriter.write(String.format("email=%s&content=%s", sender, content));
                outputStreamWriter.flush();

                if (conn.getResponseCode() == conn.HTTP_OK) {
                    InputStreamReader inputStreamReader = new InputStreamReader(conn.getInputStream(), "UTF-8");
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuffer stringBuffer = new StringBuffer();
                    String line = "";
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuffer.append(line);
                    }
                    Log.d(CUS_MAIN_ACTIVITY, String.format("stringBuffer : %s", stringBuffer));
                } else {
                    Log.d(CUS_MAIN_ACTIVITY, String.valueOf(conn.getResponseCode()));
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
