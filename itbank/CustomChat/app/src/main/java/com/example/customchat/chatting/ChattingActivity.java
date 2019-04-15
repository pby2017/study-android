package com.example.customchat.chatting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.customchat.R;
import com.example.customchat.chatting.adapter.ChattingAdapter;
import com.example.customchat.chatting.model.ChattingMessage;
import com.example.customchat.config.CustomConfig;
import com.example.customchat.constant.CustomConstant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.customchat.constant.CustomConstant.LogConstant.CUS_CHATTING_ACTIVITY;


public class ChattingActivity extends AppCompatActivity implements View.OnClickListener {

    private BroadcastReceiver chattingMessageBroadcastReceiver;

    private String receiverEmail;
    private ArrayList<ChattingMessage> chattingMessages;

    private LinearLayoutManager messageLinearLayoutManager;
    private ChattingAdapter messageAdapter;

    private RecyclerView showMessageRecycler;
    private EditText sendMessageEdit;
    private Button sendMessageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);

        initView();

        initialize();
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("receive_message");
        registerReceiver(chattingMessageBroadcastReceiver, intentFilter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_send_message:
                String message = sendMessageEdit.getText().toString();
                Toast.makeText(getApplicationContext(), String.format("message = %s", message), Toast.LENGTH_SHORT).show();
                pushMessage(message);
                sendMessageEdit.setText("");
                break;
        }
    }

    private void initView() {
        showMessageRecycler = findViewById(R.id.recycler_show_messages);
        sendMessageEdit = findViewById(R.id.edit_send_message);
        sendMessageButton = findViewById(R.id.button_send_message);
        sendMessageButton.setOnClickListener(this);

    }

    private void initialize() {
        receiverEmail = getIntent().getStringExtra("receiverEmail");

        chattingMessages = new ArrayList<>();

        messageLinearLayoutManager = new LinearLayoutManager(this);
        messageAdapter = new ChattingAdapter(chattingMessages, CustomConfig.getInstance().getEmail());

        showMessageRecycler.setLayoutManager(messageLinearLayoutManager);
        showMessageRecycler.setAdapter(messageAdapter);

        chattingMessageBroadcastReceiver = new BroadcastReceiver() {

            @Override
            public void onReceive(Context context, Intent intent) {
                String name = intent.getAction();
                Log.d(CUS_CHATTING_ACTIVITY, name);
                if (name.equals("receive_message")) {

                    chattingMessages.add(new ChattingMessage(
                            intent.getStringExtra("email"),
                            intent.getStringExtra("content")
                    ));
                    messageAdapter.notifyDataSetChanged();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            showMessageRecycler.scrollToPosition(messageAdapter.getItemCount() - 1);
                        }
                    }, 200);
                }
            }
        };
    }

    private void pushMessage(String message) {
        try {
            Log.d(CUS_CHATTING_ACTIVITY, new CustomHttpAsyncTask().execute(
                    CustomConstant.CommunicatingType.TYPE_SEND_MESSAGE,
                    CustomConfig.getInstance().getUrlString(),
                    CustomConfig.getInstance().getEmail(),
                    receiverEmail,
                    message)
                    .get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public class CustomHttpAsyncTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... strings) {
            try {
                if (strings.length != 5) {
                    return "실패";
                }
                String type = strings[0];

                if (type.equals(CustomConstant.CommunicatingType.TYPE_SEND_MESSAGE)) {
                    String urlString = strings[1];
                    String sender = strings[2];
                    String receiver = strings[3];
                    String content = strings[4];

                    URL url = new URL(urlString);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

                    conn.setDoOutput(true);
                    conn.setDoInput(true);

                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(conn.getOutputStream());

                    outputStreamWriter.write(String.format("type=%s&sender=%s&receiver=%s&content=%s",
                            CustomConstant.CommunicatingType.TYPE_SEND_MESSAGE, sender, receiver, content));
                    outputStreamWriter.flush();

                    if (conn.getResponseCode() == conn.HTTP_OK) {
                        InputStreamReader inputStreamReader = new InputStreamReader(conn.getInputStream(), "UTF-8");
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        StringBuffer stringBuffer = new StringBuffer();
                        String line = "";
                        while ((line = bufferedReader.readLine()) != null) {
                            stringBuffer.append(line);
                        }
                        Log.d(CUS_CHATTING_ACTIVITY, String.format("stringBuffer : %s", stringBuffer.toString()));
                    } else {
                        Log.d(CUS_CHATTING_ACTIVITY, String.valueOf(conn.getResponseCode()));
                    }

                    outputStreamWriter.close();
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
