package com.example.customchat.chatting.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.customchat.R;
import com.example.customchat.chatting.model.ChattingMessage;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChattingAdapter extends RecyclerView.Adapter<ChattingAdapter.ChattingMessageViewHolder> {

    private ArrayList<ChattingMessage> chattingMessages;
    private String myEmail;

    public ChattingAdapter(ArrayList<ChattingMessage> chattingMessages, String myEmail) {
        this.chattingMessages = chattingMessages;
        this.myEmail = myEmail;
    }

    @NonNull
    @Override
    public ChattingMessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_message, viewGroup, false);
        ChattingMessageViewHolder messageViewHolder = new ChattingMessageViewHolder(view);

        return messageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChattingMessageViewHolder messageViewHolder, int position) {
        if (chattingMessages.get(position).getSender().equals(myEmail)) {
            messageViewHolder.messageContentText.setBackgroundResource(R.drawable.rightbubble);
            messageViewHolder.messageSenderText.setText(chattingMessages.get(position).getSender());
            messageViewHolder.messageContentText.setText(chattingMessages.get(position).getContent());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
            );
            messageViewHolder.messageLinear.setLayoutParams(layoutParams);
        } else {
            messageViewHolder.messageContentText.setBackgroundResource(R.drawable.leftbubble);
            messageViewHolder.messageSenderText.setText(chattingMessages.get(position).getSender());
            messageViewHolder.messageContentText.setText(chattingMessages.get(position).getContent());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
            );
            messageViewHolder.messageLinear.setLayoutParams(layoutParams);
        }
    }

    @Override
    public int getItemCount() {
        return chattingMessages.size();
    }

    class ChattingMessageViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout messageLinear;
        private TextView messageSenderText;
        private TextView messageContentText;

        public ChattingMessageViewHolder(@NonNull View itemView) {
            super(itemView);
            messageLinear = itemView.findViewById(R.id.linear_message);
            messageSenderText = itemView.findViewById(R.id.text_message_sender);
            messageContentText = itemView.findViewById(R.id.text_message_content);
        }
    }

}
